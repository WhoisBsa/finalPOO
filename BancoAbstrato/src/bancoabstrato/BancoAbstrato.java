
package bancoabstrato;

import Classes.Banco;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;

public class BancoAbstrato {

    public static void main(String[] args) {
        Banco banco = new Banco();
        
       // banco.cc[0] = new ContaCorrente("aaaaa", 12);
        
        
        ContaCorrente ccP = new ContaCorrente(3, 100.0);
        
        ContaCorrente cc = new ContaCorrente(0, 100.0);
        banco.inserir(cc);
        cc = new ContaCorrente(1, 100.0);
        banco.inserir(cc);
        cc = new ContaCorrente(2, 100.0);
        banco.inserir(cc);
        cc = new ContaCorrente(3, 100.0);
        banco.inserir(cc);
        cc = new ContaCorrente(4, 100.0);
        banco.inserir(cc);
        cc = new ContaCorrente(5, 100.0);
        banco.inserir(cc);
        cc = new ContaCorrente(6, 100.0);
        banco.inserir(cc);
        cc = new ContaCorrente(7, 100.0);
        banco.inserir(cc);
        cc = new ContaCorrente(8, 100.0);
        banco.inserir(cc);
        cc = new ContaCorrente(9, 100.0);
        banco.inserir(cc);
        
        

      //  System.out.println(banco.inserir(cc, "20426-5", 100.0));
//        System.out.println(banco.inserir(cc, "20426-5", 100.0));
//        System.out.println(banco.inserir(cc, "20426-5", 100.0));
//        System.out.println(banco.inserir(cc, "20426-5", 100.0));
//        System.out.println(banco.inserir(cc, "20426-5", 100.0));
//        System.out.println(banco.inserir(cc, "20426-5", 100.0));
//        System.out.println(banco.inserir(cc, "20426-5", 100.0));
//        System.out.println(banco.inserir(cc, "20426-5", 100.0));
        
        banco.remover(ccP);
        System.out.println(banco.cc[2].getNumConta());
        System.out.println(banco.cc[3].getNumConta());
        System.out.println(banco.cc[4].getNumConta());
        banco.procurarConta(7);
       
        
        
        
        
        
        
//        ContaPoupanca cp[] = new ContaPoupanca[10];
//        ContaCorrente cc[] = new ContaCorrente[10];
//        
//        cp[0] = new ContaPoupanca("aaa", 0.0);
//        cp[0].depositar(100.0);        
//        System.out.println(cp[0].getSaldo());
//        
//        for(ContaPoupanca p : cp){
//            if(p != null){
//                System.out.println(p.getNumConta());
//            }
//        }
//        
//        cp[0] = null;
//        
//        System.out.println(cp[0].getSaldo());
//        
//        for(ContaPoupanca p : cp){
//            if(p != null){
//                System.out.println(p.getNumConta());
//            }
//            else{
//                System.out.println("Nulo");
//            }
//        }
//        
//        
//        
//        ContaCorrente cc;
//        ContaCorrente cc2;
//        
//        cc = new ContaCorrente("aaa", 0.0);
//        cc2 = new ContaCorrente("bbb", 0.0);
//        
//        ContaPoupanca cp = new ContaPoupanca("aaa", 0.0);
//        ContaPoupanca cp2 = new ContaPoupanca("bbb", 0.0);
//        
//        
//        cp.depositar(100.0);
//        
//        System.out.println(cp.getSaldo());
//        
//        cp.transferirCorrente(10.0, cc);
//        
//        System.out.println(cp.getSaldo());
//        
//        System.out.println(cc.getSaldo());
//        
//        System.out.println(cc.mostrarDados());
//        System.out.println(cp.mostrarDados());
        
        
//        System.out.println(cc.getSaldo());
//        cc.sacar(10.0);
//        System.out.println(cc.getSaldo());
    }
    
}
