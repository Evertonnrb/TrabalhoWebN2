package br.com.uniderp.dal;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {

    public static Connection getConnection() {
        java.sql.Connection conexao = null;
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/trabalho_web";
        String usuario = "postgres";
        String senha = "postgres";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            return conexao;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro = classe moduloConexao " + e);
            return null;
        }
    }

}