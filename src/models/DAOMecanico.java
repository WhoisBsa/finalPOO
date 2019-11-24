/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author matheus
 */
public class DAOMecanico {
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/tupi";
    public static final String user = "root";
    public static final String psswd = "root";
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
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
    
    public String salvar(Mecanico m) {
        String sql = "insert into funcionario(matricula, nome, turno, funcao, salario, pwd) "
                + "values(?, ?, ?, ?, ?, ?)";
        
        conexao = DAOMecanico.conectar();
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, m.getMatricula());
            pst.setString(2, m.getNome());
            pst.setString(3, m.getTurno());
            pst.setString(4, m.getFuncao());
            pst.setDouble(5, m.getSalario());
            pst.setString(6, m.getPwd());
            
            
            
            int adicionado = pst.executeUpdate();
            
            if(adicionado > 0) {
                return "Funcionário cadastrado com sucesso!";
            } else {
                return "Não foi possível cadastrar o funcionário!";
            }
        } catch(SQLException ex) {
            System.out.println(ex);
        } finally {
            DAOMecanico.desconectar(conexao);
        }
        return null;
    }
    
    public String delete(String matricula) {
        String sql = "delete from funcionario where matricula = ?";
        
        conexao = DAOMecanico.conectar();
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, matricula);
            
            int adicionado = pst.executeUpdate();
            
            if(adicionado > 0)
                return "Apagado com sucesso!";
            else
                return "Id inexistente!";
            
        } catch(SQLException ex) {
            System.out.println(ex);;
        } finally {
            DAOMecanico.desconectar(conexao);
        }
        return null;
    }
    
    public String atualizar(String nome, String turno, String funcao, 
            double salario, String pwd, String matricula) {
        String sql = "update funcionario set, nome = ?, turno = ?, funcao = ?, "
                + "salario = ?, pwd = ?"
                + "where matricula = ?";
        
        conexao = DAOMecanico.conectar();
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, nome);
            pst.setString(2, turno);
            pst.setString(3, funcao);
            pst.setDouble(4, salario);
            pst.setString(5, pwd);
            pst.setString(6, matricula);
            
            int adicionado = pst.executeUpdate();
            
            if(adicionado > 0)
                return "Funcionário atualizado com sucesso!";
            else
                return "Não foi possível atualizar este funcionário!";
        } catch(SQLException ex) {
            System.out.println(ex);
        } finally {
            DAOMecanico.desconectar(conexao);
        }
        return null;
    }
    
    public ResultSet visualizar(String matricula) {
        String sql = "slect * from funcionario where matricula = ?";
        
        conexao = DAOMecanico.conectar();
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, matricula);
            
            rs = pst.executeQuery();
            
        } catch(SQLException ex) {
            System.out.println(ex);;
        } finally {
            return rs;
        }
    }
}
