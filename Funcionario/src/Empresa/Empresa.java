
package Empresa;

import Classes.Chefe;
import Classes.Funcionario;
import Classes.Piao;

public class Empresa {

    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("Faxineiro", 45, 1000.00);
        
        Piao nirsu = new Piao("Candongueiro", 43, 1010.00);
        
        Chefe silverio = new Chefe("Mandador", 25, 1001010.00);
        
        nirsu.baterPonto();
        nirsu.trabalhar();
        System.out.println(nirsu.getFuncao());
        
        silverio.baterPonto();
        silverio.mandar();
        System.out.println(silverio.getFuncao());
    }
    
}
