
package Classes;

import javax.swing.JOptionPane;

public class ContaCorrente extends ContaBancaria{
    protected double taxaDeOperacao = 1.05;
    
    public ContaCorrente(){
        
    }
    
    public ContaCorrente(int numConta, double saldo){
        super(numConta, saldo);
    }

    @Override
    public boolean sacar(Double saque) {
        double totalTaxa;
        totalTaxa = saque * taxaDeOperacao;
          
        if((this.getSaldo() - totalTaxa) >= 0){
            double saldoAtual = this.getSaldo();
            this.setSaldo((saldoAtual - totalTaxa));
            return true;
        }
        return false;
    }

    @Override
    public void depositar(Double deposito) {
        double taxaDeposito;
        
        double saldoAtual = this.getSaldo();
        
        taxaDeposito = (taxaDeOperacao - 1) * deposito;
        
        deposito -= taxaDeposito;
        
        this.setSaldo(deposito + this.getSaldo());
        
    }
    
    @Override
    public void transferir(Double valor, ContaCorrente cc) {
        this.sacar(valor);
        cc.depositar(valor);
    }

    @Override
    public void transferir(Double valor, ContaPoupanca cp) {
        this.sacar(valor);
        cp.depositar(valor);
    }

    @Override
    public String mostrarDados() {
        String dados;
        
        dados = "Número da conta corrente: " + this.getNumConta() + "\n Saldo da conta: " + this.getSaldo();
        
        return dados;
    }
}
