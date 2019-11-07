
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sql.DBconn;

public class Usuario {
    protected String login;
    protected String senha;
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public boolean logar(String login, String senha){
        String loginAux;
        String senhaAux;
        
        String sql = "select login, senha from usuario where login = ? and senha = ?";
        
        conexao = DBconn.conectar();
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, login);
            pst.setString(2, senha);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                loginAux = rs.getString("login");
                senhaAux = rs.getString("senha");
                
                if((loginAux.equals(login) && (senhaAux.equals(senha)))){
//                    System.out.println("Usuário: " + loginAux + " Logado com sucesso com a senha: " + senhaAux);
                    return true;
                }
            }
            return false;
            
            
        } 
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
        finally{
            DBconn.fecharConexao(conexao);
        }
        
    }
    
    
}
