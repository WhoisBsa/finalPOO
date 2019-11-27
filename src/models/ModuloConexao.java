/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.DriverManager;

import java.sql.SQLException;

/**
 *
 * @author matheus
 */
public class ModuloConexao {
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/tupi";
    public static final String user = "root";
    public static final String psswd = "root";
//    public static final String psswd = "u2kW.#dp";
    
    public static java.sql.Connection conectar() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, psswd);
            
        } catch(ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
    
    public static void desconectar(java.sql.Connection con) {
        if(con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex);;
            }
        }
    }
}
