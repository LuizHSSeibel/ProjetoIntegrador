/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projeto.ConexaoBD;
import java.sql.*;

/**
 *
 * @author Luiz
 */
public class Conexao {
    public static Connection Conector() {
        Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/projeto";
        String user = "root";
        String password = "123qwe@";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}