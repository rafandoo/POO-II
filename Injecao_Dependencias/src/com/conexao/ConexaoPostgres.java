package com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexaoPostgres {

    private final static String DRIVER = "org.postgresql.Driver";
    private final static String NOME_DO_BANCO = "contatos";
    private final static String URL = "jdbc:postgresql://localhost:5450/" + NOME_DO_BANCO;
    private final static String USER = "postgres";
    private final static String PASSWORD = "";

    public static Connection getConexao() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Erro: " + e);
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Connection conn) {
        try {
            if(conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.err.println("Erro: " + e);
            e.printStackTrace();
        }
    }

    public static void close(Connection conn, Statement stmt) {
        close(conn);
        try {
            if(stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            System.err.println("Erro: " + e);
            e.printStackTrace();
        }
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        close(conn, stmt);
        try {
            if(rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.err.println("Erro: " + e);
            e.printStackTrace();
        }
    }
}
