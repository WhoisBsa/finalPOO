
package Classes;

public abstract class ContaBancaria {
    protected int numConta;
    protected Double saldo;
    
    public ContaBancaria(){
        
    }
    
    public ContaBancaria(int numConta, double saldo){
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public abstract String mostrarDados();
    
    public abstract void sacar(Double valor);
    
    public abstract void depositar(Double valor);
    
    public abstract void transferir(Double valor, ContaCorrente cc);
    
    public abstract void transferir(Double valor, ContaPoupanca cp);
}
