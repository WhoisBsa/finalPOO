
package bancoabstrato;

import Classes.Banco;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;

public class BancoAbstrato {

    public static void main(String[] args) {
        Banco banco = new Banco();
        
        ContaPoupanca cpP = new ContaPoupanca(3, 100.0);
        
        ContaPoupanca cp = new ContaPoupanca(0, 100.0);
        banco.inserir(cp);
        cp = new ContaPoupanca(1, 100.0);
        banco.inserir(cp);
        cp = new ContaPoupanca(2, 100.0);
        banco.inserir(cp);
        cp = new ContaPoupanca(3, 100.0);
        banco.inserir(cp);
        cp = new ContaPoupanca(4, 100.0);
        banco.inserir(cp);
        cp = new ContaPoupanca(5, 100.0);
        banco.inserir(cp);
        cp = new ContaPoupanca(6, 100.0);
        banco.inserir(cp);
        cp = new ContaPoupanca(7, 100.0);
        banco.inserir(cp);
        cp = new ContaPoupanca(8, 100.0);
        banco.inserir(cp);
        cp = new ContaPoupanca(9, 100.0);
        banco.inserir(cp);
        
        
        banco.remover(cpP);
        System.out.println(banco.cp[2].getNumConta());
        System.out.println(banco.cp[3].getNumConta());
        System.out.println(banco.cp[4].getNumConta());
        ContaPoupanca procurar = banco.procurarContaPoupanca(7);
        System.out.println(procurar.getNumConta());
       
    }
    
}
