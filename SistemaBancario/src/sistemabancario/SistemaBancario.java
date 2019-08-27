package sistemabancario;

import Classes.Cliente;
import Classes.Menu;
import java.util.Scanner;

/**
 *
 * @author hemilio
 */
public class SistemaBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = 0;
        double valor = 0;
        
        Cliente usuario = new Cliente("Hemílio", "12332112321", "física", "12345-0");
        Cliente cliente1 = new Cliente("Robervaldo", "26549569781", "física", "54321-0");
        Cliente cliente2 = new Cliente("Rosilene", "62742789356", "física", "10101-0");
        
        Scanner s = new Scanner(System.in);
        Menu menu = new Menu();
        
        //MENU        
        while(opcao != 5){
            menu.menu_principal();
            opcao = s.nextInt();
        
            switch(opcao){
                case 1:
                    menu.limpa_tela();
                    System.out.println("Qual o valor do saque?");
                    valor = s.nextDouble();
                    usuario.saque(valor);
                    menu.voltar();
                    break;
                case 2:
                    menu.limpa_tela();
                    usuario.saldo();
                    menu.voltar();
                    
                    break;
                case 3:
                    menu.limpa_tela();
                    System.out.println("Temos os seguintes clientes para depósito:");
                    System.out.println("1 - " + cliente1.get_nome());
                    System.out.println("2 - " + cliente2.get_nome());
                    System.out.println("3 - " + usuario.get_nome());
                    opcao= s.nextInt();

                    System.out.println("Qual o valor do depósito?");
                    valor = s.nextDouble();

                    switch(opcao){
                        case 1:
                            usuario.deposito(valor, cliente1);
                            break;
                        case 2:
                            usuario.deposito(valor, cliente2);
                            break;
                        case 3:
                            usuario.deposito(valor, usuario);
                            break;
                    }
                    menu.voltar();
                    break;
                case 4:
                    menu.limpa_tela();
                    System.out.println("Temos os seguintes clientes para depósito:");
                    System.out.println("1 - " + cliente1.get_nome());
                    System.out.println("2 - " + cliente2.get_nome());
                    System.out.println("3 - " + usuario.get_nome());
                    opcao = s.nextInt();

                    System.out.println("Qual o valor da transferência?");
                    valor = s.nextDouble();

                    switch(opcao){
                        case 1:
                            usuario.transferencia(valor, cliente1);
                            break;
                        case 2:
                            usuario.transferencia(valor, cliente2);
                            break;
                        case 3:
                            usuario.transferencia(valor, usuario);
                            break;
                    }
                    menu.voltar();
                    break;
                case 5:
                    System.exit(0);
            }
          
        }
   
    }
    
}
