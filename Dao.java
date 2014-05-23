/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiveware;

/**
 *
 * @author Acer
 */
import java.sql.*;

public class Dao {

    protected Connection cn;
    protected PreparedStatement st;
    protected ResultSet rs;
    protected String erro;


    private String url = "jdbc:mysql://localhost:3306/fiveware";

    public boolean abreConexao() throws Exception {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, "root", "root");
            System.out.println("deu certo");
            return true;
        } catch (Exception e) {
            e.getMessage();
            System.out.println(e);
            throw e;
        }

    }

    public void fechaConexao() throws Exception {
        cn.close();
    }

    public String getErro() {
        return erro;
    }
    
    
    
}
