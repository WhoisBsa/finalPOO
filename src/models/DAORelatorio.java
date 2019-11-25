/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author matheus
 */
public class DAORelatorio {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public String salvar(Relatorio r) {
        String sql = "insert into relatorio(aplicacao, matricula, inicio, fim, "
                + "observacoes, codMterial, qtdMaterial, numOs) "
                + "values(?, ?, ?, ?, ?, ?, ?, ?)";
        
        conexao = ModuloConexao.conectar();
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, r.getAplicacao());
            pst.setString(2, r.getMatricula());
            pst.setString(3, r.getDataInicio() + " " + r.getHoraInicio());
            pst.setString(4, r.getDataFim() + " " + r.getHoraFim());
            pst.setString(5, r.getObservacoes());
            pst.setString(6, r.getCodMaterial());
            pst.setInt(7, r.getQtdMaterial());
            pst.setString(8, r.getNumOs());
            
            int adicionado = pst.executeUpdate();
            
            if(adicionado > 0) {
                return "Relatório criado com sucesso!";
            } else {
                return "Não foi possível criar o relatório!";
            }
        } catch(SQLException ex) {
            System.out.println(ex);
        } finally {
            ModuloConexao.desconectar(conexao);
        }
        return null;
    }
    
    public String delete(int id) {
        String sql = "delete from relatorio where id = ?";
        
        conexao = ModuloConexao.conectar();
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setInt(1, id);
            
            int adicionado = pst.executeUpdate();
            
            if(adicionado > 0)
                return "Apagado com sucesso!";
            else
                return "Id inexistente!";
            
        } catch(SQLException ex) {
            System.out.println(ex);
        } finally {
            ModuloConexao.desconectar(conexao);
        }
        return null;
    }
    
    public String atualizar(String aplicacao, String matricula, String dataInicio, 
            String dataFim, String horaInicio, String horaFim, 
            String observacoes, String codMaterial, int qtdMaterial, String numOs, int id) {
        String sql = "update funcionario set aplicacao = ?, matricula = ?, inicio  = ?, "
                + "fim = ?, observacoes = ?, codMterial = ?, qtdMaterial = ?, numOs = ? "
                + "where id = ?";
        
        conexao = ModuloConexao.conectar();
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, aplicacao);
            pst.setString(2, matricula);
            pst.setString(3, dataInicio + " " + horaInicio);
            pst.setString(4, dataFim + " " + horaFim);
            pst.setString(5, observacoes);
            pst.setString(6, codMaterial);
            pst.setInt(7, qtdMaterial);
            pst.setString(8, numOs);
            pst.setInt(9, id);
            
            int adicionado = pst.executeUpdate();
            
            if(adicionado > 0)
                return "Funcionário atualizado com sucesso!";
            else
                return "Não foi possível atualizar este funcionário!";
        } catch(SQLException ex) {
            System.out.println(ex);
        } finally {
            ModuloConexao.desconectar(conexao);
        }
        return null;
    }
    
    public ResultSet visualizar(int id) {
        String sql = "select * from relatorio left join funcionario on "
                + "relatorio.matricula = funcionario.matricula where relatorio.id = ?;";
        
        conexao = ModuloConexao.conectar();
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setInt(1, id);
            
            rs = pst.executeQuery();
            
        } catch(SQLException ex) {
            System.out.println(ex);
        } finally {
            return rs;
        }
    }
}
