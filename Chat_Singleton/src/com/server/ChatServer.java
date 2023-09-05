package com.server;

import java.io.*;
import java.net.*;
import java.util.Optional;
import java.util.concurrent.*;

public class ChatServer {

    private static ChatServer instance;
    private ConcurrentHashMap<PrintWriter, String> clients;

    private ChatServer() {
        clients = new ConcurrentHashMap<>();
    }

    public static synchronized ChatServer getInstance() {
        if (instance == null) {
            instance = new ChatServer();
        }
        return instance;
    }

    public synchronized void addClient(PrintWriter client, String clientName) {
        clients.put(client, clientName);
    }

    public synchronized void removeClient(PrintWriter client) {
        clients.remove(client);
    }

    public void broadcast(String message, PrintWriter sender, Boolean info) {
        info = Optional.ofNullable(info).orElse(false);
        for (PrintWriter client : clients.keySet()) {
            String name = clients.get(sender);
            if (info) {
                client.println("@" + name + " " + message);
                System.out.println("@" + name + " " + message);
            } else {
                if (client != sender) {
                    client.println(name + " -> " + message);
                } else {
                    client.println("Eu -> " + message);
                }
            }
        }
    }

    public static void main(String[] args) {
        int port = 6080;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Servidor de chat iniciado na porta " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String clientName = in.readLine();
                ChatServer.getInstance().addClient(out, clientName);
                ChatServer.getInstance().broadcast("entrou no chat.", out, true);

                Thread clientThread = new Thread(new ClientHandler(clientSocket, out));
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {
        private Socket socket;
        private PrintWriter out;

        public ClientHandler(Socket socket, PrintWriter out) {
            this.socket = socket;
            this.out = out;
        }

        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String message;
                while ((message = in.readLine()) != null) {
                    if (message.equals("#SAIR")) {
                        break;
                    }
                    ChatServer.getInstance().broadcast(message, out, false);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                ChatServer.getInstance().broadcast("saiu do chat.", out, true);
                ChatServer.getInstance().removeClient(out);
                try {
                    socket.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
