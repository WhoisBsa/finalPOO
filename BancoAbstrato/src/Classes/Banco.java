
package Classes;

public class Banco {
    public ContaPoupanca cp[] = new ContaPoupanca[10];
    public ContaCorrente cc[] = new ContaCorrente[10];
    
    public boolean inserir(String numConta, double saldo, int tipo){
        boolean a = false;
        
        if(tipo == 0){ // POUPANÇA
            for(ContaPoupanca u : cp){
                if(u == null){
                    u = new ContaPoupanca(numConta, saldo);
                    a = true;
                }
                else{
                    a = false;
                }
            }
            return a;
        }
        else{// CORRENTE
            for(ContaCorrente u : cc){
                if(u == null){
                    u = new ContaCorrente(numConta, saldo);
                    a = true;
                }
                else{
                    a = false;
                }
            }
            return a;
        }
    }
    
    public void remover(ContaPoupanca cp){
        
    }
    
    public void remover(ContaCorrente cc){
        
    }
    
    public void procurarConta(ContaPoupanca cp){
        
    }
    
    public void procurarConta(ContaCorrente cc){
        
    }
}
