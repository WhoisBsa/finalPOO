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
public class DAOConsulta {
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
    
    
    public void salvar(Consultas c) {
        String sql = "insert into consulta(dataConsulta, cpfPaciente) "
                + "values(?,?)";
        
        conexao = this.conectar();
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, c.getData());
            pst.setString(2, c.getCpfPaciente());
            int adicionado = pst.executeUpdate();
            
            if(adicionado > 0)
                System.out.println("Consulta cadastrada com sucesso!");
            else
                System.out.println("Não foi possível cadastrar a consulta!");
        }catch(SQLException e) {
            System.out.println(e);
        }finally {
            DAOConsulta.fecharConexao(conexao);
        }
    }
    
    public ResultSet buscar(Consultas c){
        String sql = "SELECT * FROM paciente "
                + "INNER JOIN consulta on paciente.cpf = consulta.cpfPaciente "
                + "and consulta.id = ?";
        
        conexao = this.conectar();
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, c.getId());

            rs = pst.executeQuery();
            
            return rs;
        }
        catch (SQLException e) {
            System.out.println("Falha ao executar a query!");
            
            return null;
        }
    }
    
    public void atualizar(Consultas c){
        String sql = "update consulta "
                + "set dataConsulta = ? "
                + "where id = ?";;
        
        conexao = this.conectar();
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, c.getData());
            pst.setInt(2, c.getId());
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
    
    public void excluir(Consultas c){
        String sql = "delete from consulta "
                + "where id = ?";
        
        conexao = this.conectar();
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, c.getId());
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
