package com.persistencias;

import com.classes.DTO.Contato;
import com.conexao.ConexaoPostgres;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaPostgres implements Persistencia {

    public boolean salvar(Contato contato) {
        Connection conn = ConexaoPostgres.getConexao();
        String sql = "INSERT INTO contatos (nome, data_nascimento, telefone, email) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getDataNascimento());
            stmt.setString(3, contato.getTelefone());
            stmt.setString(4, contato.getEmail());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Contato> lerContatos() {
        List<Contato> contatos = new ArrayList<>();
        Connection conn = ConexaoPostgres.getConexao();
        String sql = "SELECT * FROM contatos";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String dataNascimento = resultSet.getString("data_nascimento");
                String telefone = resultSet.getString("telefone");
                String email = resultSet.getString("email");

                Contato contato = new Contato(id, nome, dataNascimento, telefone, email);
                contatos.add(contato);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contatos;
    }
}
