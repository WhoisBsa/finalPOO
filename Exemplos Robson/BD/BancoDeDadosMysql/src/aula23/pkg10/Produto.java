/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula23.pkg10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author robsonresende
 */
public class Produto {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void inserir(String marca, String nome, String preco) {
        String sql = "insert into produto(marca,nome,preco) "
                + "values(?,?,?)";
        
        conexao = ModuloConexao.conectar();
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, marca);
            pst.setString(2, nome);
            pst.setString(3, preco);
            int adicionado = pst.executeUpdate();
            
            if(adicionado > 0)
                System.out.println("Produto cadastrado com sucesso!");
            else
                System.out.println("Não foi possível cadastrar o produto!");
        }catch(Exception e) {
            System.out.println(e);
        }finally {
            ModuloConexao.fecharConexao(conexao);
        }
    }
    
    public ResultSet listar() {
        String sql = "select * from produto";
        
        conexao = ModuloConexao.conectar();
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        }catch(Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
    
}
