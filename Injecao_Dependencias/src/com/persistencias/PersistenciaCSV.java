package com.persistencias;

import com.classes.DTO.Contato;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaCSV implements Persistencia {
    private static final String ARQUIVO = "data/contatos.csv";
    private static FileWriter arquivo;
    private static PrintWriter escrever;

    public boolean salvar(Contato contato) {
        if (contato != null) {
            try {
                arquivo = new FileWriter(ARQUIVO, true);
                escrever = new PrintWriter(arquivo);
                escrever.println(
                        contato.getId() + ";"
                        + contato.getNome() + ";"
                        + contato.getDataNascimento() + ";"
                        + contato.getTelefone() + ";"
                        + contato.getEmail()
                );
                arquivo.close();
                return true;
            } catch (IOException e){
                System.err.println("Erro ao salvar o arquivo csv: " + e.getMessage());
                return false;
            }
        }
        return false;
    }

    public List<Contato> lerContatos() {
        List<Contato> contatos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 5) {
                    int id = Integer.parseInt(parts[0]);
                    String nome = parts[1];
                    String dataNascimento = parts[2];
                    String telefone = parts[3];
                    String email = parts[4];
                    contatos.add(new Contato(id, nome, dataNascimento, telefone, email));
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo CSV: " + e.getMessage());
        }
        return contatos;
    }


}
