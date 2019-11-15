/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hemilio
 */
public class DAOPaciente {
    public static final String driver = "com.mysql.cj.jdbc.Driver";
    //IP do banco, porta e o nome do banco
    public static final String url = "jdbc:mysql://localhost:3306/bdaula";
    public static final String user = "root";
    public static final String psswd = "u2kW.#dp";
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public static java.sql.Connection conectar() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, psswd);
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public static void fecharConexao(java.sql.Connection con) {
        if(con != null) {
            try {
                con.close();
            }catch(SQLException e) {
                System.out.println(e);
            }
        }
    }
    
    
    public void salvar(Pacientes p) {
        String sql = "insert into paciente(nome, cpf, nascimento, sexo) "
                + "values(?,?,?,?)";
        
        conexao = this.conectar();
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, p.getNome());
            pst.setString(2, p.getCpf());
            pst.setString(3, p.getNascimento());
            pst.setString(4, p.getSexo());
            int adicionado = pst.executeUpdate();
            
            if(adicionado > 0)
                System.out.println("Paciente cadastrado com sucesso!");
            else
                System.out.println("Não foi possível cadastrar o cliente!");
        }catch(SQLException e) {
            System.out.println(e);
        }finally {
            DAOPaciente.fecharConexao(conexao);
        }
    }
    
    public void atualizar(Pacientes p){
        String sql = "update paciente "
                + "set nome = ?, nascimento = ?, sexo = ?"
                + "where cpf = ?";;
        
        conexao = this.conectar();
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, p.getNome());
            pst.setString(2, p.getNascimento());
            pst.setString(3, p.getSexo());
            pst.setString(4, p.getCpf());
            int adicionado = pst.executeUpdate();
            
            if(adicionado > 0)
                System.out.println("Paciente cadastrado com sucesso!");
            else
                System.out.println("Não foi possível cadastrar o cliente!");
        }catch(SQLException e) {
            System.out.println(e);
        }finally {
            DAOPaciente.fecharConexao(conexao);
        }
    }
}
