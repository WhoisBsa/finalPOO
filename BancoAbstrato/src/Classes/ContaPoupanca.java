
package Classes;

public class ContaPoupanca extends ContaBancaria{
    protected double limite = -50.0;
    
    @Override
    public void sacar(Double saque) {
        if((this.getSaldo() - saque) >= limite){
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
        if(deposito > 0){
            this.setSaldo(deposito + this.getSaldo());
        }
        else{
            //JOptionPane.showMessageDialog(rootPane, "Impossível depositar R$0,00");
            System.out.println("Impossível depositar R$0,00");
        }
    }
    
    @Override
    public void transferirCorrente(Double valor, ContaCorrente cc) {
        this.sacar(valor);
        cc.setSaldo(valor + cc.getSaldo());
    }
    
    @Override
    public void transferirPoupanca(Double valor, ContaPoupanca cp) {
        this.sacar(valor);
        cp.setSaldo(valor + cp.getSaldo());
    }
    
}
