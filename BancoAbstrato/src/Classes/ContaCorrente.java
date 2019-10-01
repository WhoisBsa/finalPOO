
package Classes;

import javax.swing.JOptionPane;

public class ContaCorrente extends ContaBancaria{
    protected double taxaDeOperacao = 1.05;
    
    public ContaCorrente(){
        
    }
    
    public ContaCorrente(String numConta, double saldo){
        super(numConta, saldo);
    }

    @Override
    public void sacar(Double saque) {
        double totalTaxa;
        totalTaxa = saque * taxaDeOperacao;
          
        if((this.getSaldo() - totalTaxa) >= 0){
            double saldoAtual = this.getSaldo();
            this.setSaldo((saldoAtual - totalTaxa));
        }
        else{
            //JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente!");
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(Double deposito) {
        double taxaDeposito = 0;
        
        double saldoAtual = this.getSaldo();
        
        taxaDeposito = (taxaDeOperacao - 1) * deposito;
        
        deposito -= taxaDeposito;
        
        this.setSaldo(deposito + this.getSaldo());
        
    }
    
    @Override
    public void transferirCorrente(Double valor, ContaCorrente cc) {
        this.sacar(valor);
        cc.depositar(valor);
    }

    @Override
    public void transferirPoupanca(Double valor, ContaPoupanca cp) {
        this.sacar(valor);
        cp.depositar(valor);
    }
}
