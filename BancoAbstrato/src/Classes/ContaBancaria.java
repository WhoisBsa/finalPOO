
package Classes;

public abstract class ContaBancaria {
    protected String numConta;
    protected Double saldo;
    
    public ContaBancaria(){
        
    }
    
    public ContaBancaria(String numConta, double saldo){
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public String mostrarDados(){
        String dados;
        
        dados = "Número da conta: " + this.getNumConta() + "\n Saldo da conta: " + this.getSaldo();
        
        return dados;
    }
    
    public abstract void sacar(Double valor);
    
    public abstract void depositar(Double valor);
    
    public abstract void transferirCorrente(Double valor, ContaCorrente cc);
    
    public abstract void transferirPoupanca(Double valor, ContaPoupanca cp);
}
