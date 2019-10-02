
package Classes;

public class ContaPoupanca extends ContaBancaria{
    protected double limite = -50.0;
    
    public ContaPoupanca(){
        
    }
    
    public ContaPoupanca(String numConta, double saldo){
        super(numConta, saldo);
    }
    
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
        cc.depositar(valor);
    }
    
    @Override
    public void transferirPoupanca(Double valor, ContaPoupanca cp) {
        this.sacar(valor);
        cp.depositar(valor);
    }
    
}
