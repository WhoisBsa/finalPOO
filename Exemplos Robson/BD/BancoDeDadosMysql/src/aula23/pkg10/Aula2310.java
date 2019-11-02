/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula23.pkg10;

import java.sql.ResultSet;

/**
 *
 * @author robsonresende
 */
public class Aula2310 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModuloConexao conector = new ModuloConexao();
        Produto p = new Produto();
        ResultSet rs = p.listar();
        //p.inserir("Sony", "Playstation 4", "2000");
        //p.inserir("Nintendo", "Switch", "2400");
        
        try{
            while(rs.next()) {
                String marca = rs.getString("marca");
                String nome = rs.getString("nome");
                String preco = rs.getString("preco");
                
                System.out.println("Marca: " + marca + " Nome: " + nome + " Preço: " + preco);
            }
        }catch(Exception e) {
            System.out.println("teste" + e);
        }
    }
    
}
