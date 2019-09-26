
package Classes;

import javax.swing.JOptionPane;

public class ContaCorrente extends ContaBancaria{
    protected double taxaDeOperacao = 1.05;

    @Override
    public void sacar(Double saque) {
        saque *= taxaDeOperacao;
        
        if((this.getSaldo() - saque) >= 0){
            double saldoAtual = this.getSaldo();
            this.setSaldo((saldoAtual - saque));
        }
        else{
            //JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente!");
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(Double deposito) {
        deposito *= taxaDeOperacao;
        
        this.setSaldo(deposito);
        
    }
    
    @Override
    public void transferirCorrente(Double valor, ContaCorrente cc) {
        
    }

    @Override
    public void transferirPoupanca(Double valor, ContaPoupanca cp) {
        
    }
    
    public String mostrarDados(){
        String dados;
        
        dados = "Número da conta: " + this.getNumConta() + "\n Saldo da conta: " + this.getSaldo();
        
        return dados;
    }

    

    
    
}
