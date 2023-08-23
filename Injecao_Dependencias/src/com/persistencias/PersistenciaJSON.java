package com.persistencias;

import com.classes.DTO.Contato;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersistenciaJSON implements Persistencia {

    private static final String ARQUIVO = "data/contatos.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public boolean salvar(Contato contato) {
        List<Contato> contatos = lerContatos();
        contatos.add(contato);

        try (Writer writer = new FileWriter(ARQUIVO)) {
            gson.toJson(contatos, writer);
            return true;
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo JSON: " + e.getMessage());
            return false;
        }
    }

    public List<Contato> lerContatos() {
        try {
            if (Files.exists(Paths.get(ARQUIVO))) {
                BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO));
                List<Contato> contatos = gson.fromJson(reader, new TypeToken<List<Contato>>(){}.getType());
                reader.close();
                return contatos;
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
        return new ArrayList<>();
    }
}
