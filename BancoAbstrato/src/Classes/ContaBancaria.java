
package Classes;

public abstract class ContaBancaria {
    private String numConta;
    private Double saldo;

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
    
    public abstract void sacar(Double valor);
    
    public abstract void depositar(Double valor);
    
    public abstract void transferirCorrente(Double valor, ContaCorrente cc);
    
    public abstract void transferirPoupanca(Double valor, ContaPoupanca cp);
}
