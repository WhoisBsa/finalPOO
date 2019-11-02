
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sql.DBconn;

public class Cliente {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void inserir (String marca, String nome, String preco) {
        String sql = "insert into produto (marca, nome, preco) " + "values(?, ?, ?)";
        
        conexao = DBconn.conectar();
        
        try{
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, marca);
            pst.setString(2, nome);
            pst.setString(3, preco);
            
            int resultado = pst.executeUpdate();
            
            if(resultado > 0)
                System.out.println("Adicionado com sucesso!");
            else
                System.out.println("Falhou ao inserir!");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            DBconn.fecharConexao(conexao);
        }
    }
    
    public ResultSet listar (){
        String sql = "select * from produto";
        
        conexao = DBconn.conectar();
        
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } 
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
