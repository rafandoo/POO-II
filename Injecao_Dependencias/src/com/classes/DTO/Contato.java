package com.classes.DTO;

import java.util.Objects;

public class Contato {

    // ATRIBUTOS
    private static int nextId = 1;
    private int id;
    private String nome;
    private String data_nascimento;
    private String telefone;
    private String email;

    public Contato() {

    }

    public Contato(String nome, String data_nascimento, String telefone, String email) {
        setId(nextId++);
        setNome(nome);
        setDataNascimento(data_nascimento);
        setTelefone(telefone);
        setEmail(email);
    }

    public Contato(int id, String nome, String data_nascimento, String telefone, String email) {
        setId(id);
        setNome(nome);
        setDataNascimento(data_nascimento);
        setTelefone(telefone);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 1) {
            this.nome = nome;
        }
    }

    public String getDataNascimento() {
        return data_nascimento;
    }

    public void setDataNascimento(String data_nascimento) {
        if (data_nascimento.length() > 1) {
            this.data_nascimento = data_nascimento;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.length() > 1) {
            this.telefone = telefone;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.length() > 1) {
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", data_nascimento='" + data_nascimento + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return id == contato.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
