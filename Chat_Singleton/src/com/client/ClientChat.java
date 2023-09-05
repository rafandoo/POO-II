package com.client;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import java.io.*;
import java.net.Socket;
import java.util.Optional;

public class ClientChat extends Application {

    private TextArea chatArea;
    private TextField messageField;
    private Button sendButton;
    private Button disconnectButton;
    private Socket socket;
    private PrintWriter out;
    private String clientName;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Chat do Cliente");

        chatArea = new TextArea();
        chatArea.setEditable(false);
        messageField = new TextField();
        sendButton = new Button("Enviar");
        disconnectButton = new Button("Desconectar");

        sendButton.setOnAction(e -> sendMessage());
        disconnectButton.setOnAction(e -> stop());

        HBox inputBox = new HBox(messageField, sendButton, disconnectButton);
        HBox.setHgrow(messageField, Priority.ALWAYS);

        BorderPane root = new BorderPane();
        root.setCenter(chatArea);
        root.setBottom(inputBox);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);

        messageField.setOnAction(e -> sendButton.fire());


        // Solicitar o nome do usuário
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Nome de Usuário");
        dialog.setHeaderText("Digite seu nome de usuário:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            clientName = result.get();
        } else {
            Platform.exit();
            return;
        }

        connectToServer();

        primaryStage.setOnCloseRequest(e -> {
            disconnectFromServer();
            Platform.exit();
        });

        primaryStage.show();
    }

    private void connectToServer() {
        try {
            socket = new Socket("localhost", 6080); // Endereço e porta do servidor
            out = new PrintWriter(socket.getOutputStream(), true);

            out.println(clientName);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            Thread messageListener = new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        String finalMessage = message;
                        Platform.runLater(() -> chatArea.appendText(finalMessage + "\n"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            messageListener.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage() {
        String message = messageField.getText();
        if (!message.isEmpty()) {
            out.println(message);
            messageField.clear();
        }
    }

    private void disconnectFromServer() {
        try {
            out.println("#SAIR");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        disconnectFromServer();
        Platform.exit();
        System.exit(0);
    }
}
