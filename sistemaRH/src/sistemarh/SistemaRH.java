
package sistemarh;

import classes.Cliente;
import classes.Funcionario;
import classes.Gerente;
import classes.Vendedor;
import java.util.Scanner;


public class SistemaRH {

    public static void main(String[] args) {
        int posicao = 0;
        int op;
        String nome;
        int idade;
        String tipo;
        
        Scanner s = new Scanner(System.in);
        
        Cliente clientes[] = new Cliente[50];
        
        while(true){
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Cadastrar cliente");
            
            op = s.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Nome: ");
                    nome = s.next();
                    System.out.println(nome);
                    
                    System.out.print("Idade: ");
                    idade = s.nextInt();
                    s.nextLine();
                    
                    System.out.println(idade);
                    System.out.print("Tipo: ");
                    tipo = s.nextLine();
                    System.out.println(tipo);
                    
                    clientes[posicao] = new Cliente(nome, idade, tipo);
                    posicao++;
                    clientes[posicao].mostrarDados();
                    break;
                    
                    
            }
            
            
        }
        
//        Funcionario f = new Funcionario("Joao", 23, 1234.00, 12); //String nome, int idade, double salario, int codFunc
//        Cliente c = new Cliente("Joaquim", 26, "Gold"); //String nome, int idade, String tipo
//        
//        Funcionario funcionarios[] = new Funcionario[10];
//        
//        funcionarios[0] = f;
//        funcionarios[0].mostrarDados();
//        
//        Gerente g = new Gerente("Bené", 34, 6000, 456, 800);
//        Vendedor v = new Vendedor("Manoel", 19, 1200,321, 500);
//        
//        f.mostrarDados();
//        c.mostrarDados();
//        g.mostrarDados();
//        v.mostrarDados();
    }
    
}
