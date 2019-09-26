
package Classes;

public class ContaPoupanca extends ContaBancaria{
    protected double limite;
    
    @Override
    public void sacar(Double valor) {
        
    }

    @Override
    public void depositar(Double valor) {
        
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
