
package bancoabstrato;

import Classes.ContaCorrente;
import Classes.ContaPoupanca;

public class BancoAbstrato {

    public static void main(String[] args) {
        
        ContaCorrente cc;
        ContaCorrente cc2;
        
        cc = new ContaCorrente("aaa", 0.0);
        cc2 = new ContaCorrente("bbb", 0.0);
        
        ContaPoupanca cp = new ContaPoupanca();
        
        
        cc.depositar(100.0);
        
        System.out.println(cc.getSaldo());
        
        cc.transferirCorrente(10.0, cc2);
        
        System.out.println(cc.getSaldo());
        
        System.out.println(cc2.getSaldo());
//        System.out.println(cc.getSaldo());
//        cc.sacar(10.0);
//        System.out.println(cc.getSaldo());
    }
    
}
