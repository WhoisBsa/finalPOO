
package sistemarh;

import classes.Cliente;
import classes.Funcionario;
import classes.Gerente;
import classes.Vendedor;


public class SistemaRH {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Joao", 23, 1234.00, 12); //String nome, int idade, double salario, int codFunc
        Cliente c = new Cliente("Joaquim", 26, "Gold"); //String nome, int idade, String tipo
        
        Gerente g = new Gerente("Bené", 34, 6000, 456, 800);
        Vendedor v = new Vendedor("Manoel", 19, 1200,321, 500);
        
        f.mostrarDados();
        c.mostrarDados();
        g.mostrarDados();
        v.mostrarDados();
    }
    
}
