package Classes;

//import Classes.Cliente;
import java.util.Scanner;

public class Menu {
    
    Scanner s = new Scanner(System.in);
    
    public void menu_principal(){
        this.limpa_tela();
        System.out.println("********************************");
        System.out.println("*       BANCO ROUBA BEM        *");
        System.out.println("********************************\n");
        System.out.println("Seja bem vindo!");
        
        System.out.println("1 - Saque");
        System.out.println("2 - Verificar saldo");
        System.out.println("3 - Depositar");
        System.out.println("4 - Transferir");
        System.out.println("5 - Sair");
    }
        
    
    public void limpa_tela(){
        for (int i = 0; i < 50; ++i)
            System.out.println();
    }
    
    
    public void voltar(){
        System.out.println("Digite 0 para voltar.");
        s.next();
    }
    
    
    public void transferencia(double valor, Cliente destinatario){
        System.out.println("****** TRANSFERÊNCIA ******");
        System.out.println("Valor: R$" + valor);
        System.out.println("Destinataŕio: " + destinatario.get_nome());
        System.out.println("Número da conta: " + destinatario.get_numero_da_conta());
    }
    
    
    public void deposito(double valor, Cliente destinatario){
        System.out.println("****** DEPÓSITO ******");
        System.out.println("Valor: R$" + valor);
        System.out.println("Destinataŕio: " + destinatario.get_nome());
        System.out.println("Número da conta: " + destinatario.get_numero_da_conta());
    }
    
    
    public void saque(double valor, Cliente usuario){
        System.out.println("****** SAQUE ******");
        System.out.println("Saque no valor de: R$" + valor);
        System.out.println("Saldo atual: R$" + usuario.get_saldo_da_conta());
    }
    
    
    public void saldo(Cliente usuario){
        System.out.println("****** SALDO ******");
        System.out.println("Seu saldo é de: R$" + usuario.get_saldo_da_conta());
    }
    
}
