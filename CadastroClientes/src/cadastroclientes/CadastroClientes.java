/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroclientes;

import Classes.Usuario;
import Telas.TelaLogin;

/**
 *
 * @author hemilio
 */
public class CadastroClientes {

    public static void main(String[] args) {
        Usuario usuarios[] = new Usuario[4];
        
        usuarios[0] = new Usuario("a","1");
        usuarios[1] = new Usuario("b","2");
        usuarios[2] = new Usuario("c","3");
        usuarios[3] = new Usuario("d","4");
        
        TelaLogin login = new TelaLogin(usuarios);
        
        login.setVisible(true);
        System.out.println("tela login");
    }
    
}
