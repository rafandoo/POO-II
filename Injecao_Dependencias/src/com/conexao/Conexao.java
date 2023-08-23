package com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    private final static String NOME_DO_BANCO = "contatos";
    private final static String URL = "jdbc:mysql://localhost:3306/" + NOME_DO_BANCO;
    private final static String USER = "root";
    private final static String PASSWORD = "Rplus@2406";

    public static Connection getConexao() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Erro: " + e);
            e.printStackTrace();
            return null;
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
