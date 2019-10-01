
package Classes;

public class Banco {
    ContaPoupanca cp[] = new ContaPoupanca[10];
    ContaCorrente cc[] = new ContaCorrente[10];
    
    public boolean inserir(ContaPoupanca cp[], ContaPoupanca novo){
        boolean a = false;
        for(ContaPoupanca u : cp){
            if(u == null){
                u = novo;
                return true;
            }
            else{
                return false;
            }
        }
        return a;
    }
    
    public boolean inserir(ContaCorrente cc[], ContaCorrente novo){
        boolean a = false;
        for(ContaCorrente u : cc){
            if(u == null){
                u = novo;
                a = true;
            }
            else{
                a = false;
            }
        }
        return a;
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
