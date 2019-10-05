
package Classes;

public class Banco {
    public ContaPoupanca cp[] = new ContaPoupanca[10];
    public ContaCorrente cc[] = new ContaCorrente[10];
    protected int posCC, posCP = 0;

    public Banco() {
        for(int i = 0; i < cc.length; i++){
                cc[i] = new ContaCorrente(-1,0);
            }
        for(int i = 0; i < cp.length; i++){
                cp[i] = new ContaPoupanca(-1,0);
            }
    }
     
    
    public boolean inserir(ContaCorrente contaCorrente){
        int posicao = procurarPosicaoConta(contaCorrente);
        
        if(posicao == this.cc.length){
            for(int i = 0; i < this.cc.length; i++){
                if(this.cc[i].getNumConta() == -1){
                    this.cc[i] = contaCorrente;
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public void remover(ContaCorrente contaCorrente){
        int posicao = procurarPosicaoConta(contaCorrente);
        if(posicao != this.cc.length){
            this.cc[posicao] = new ContaCorrente(-1,0);
        }
    }
    
    
    public ContaCorrente procurarContaCorrente(int numConta){
        for(ContaCorrente u : this.cc){
            if(numConta == u.getNumConta()){
                return u;
            }
        }
        return new ContaCorrente(-1,0);
    }
    
    
    public int procurarPosicaoConta(ContaCorrente contaCorrente){
        int i = 0;
        for(ContaCorrente u : this.cc){
            if(u.getNumConta() == contaCorrente.getNumConta()){
                return i;
            }
            i++;
        }
        return i; //Se == 10, não encontrou.
    }
    
    
    public boolean inserir(ContaPoupanca contaPoupanca){
    int posicao = procurarPosicaoConta(contaPoupanca);
    
    if(posicao == this.cp.length){
        for(int i = 0; i < this.cp.length; i++){
            if(this.cp[i].getNumConta() == -1){
                this.cp[i] = contaPoupanca;
                return true;
            }
        }
    }
    return false;
    }


    public void remover(ContaPoupanca contaPoupanca){
        int posicao = procurarPosicaoConta(contaPoupanca);
        if(posicao != this.cp.length){
            this.cp[posicao] = new ContaPoupanca(-1,0);
        }
    }


    public ContaPoupanca procurarContaPoupanca(int numConta){
        for(ContaPoupanca u : this.cp){
            if(numConta == u.getNumConta()){
                return u;
            }
        }
        return new ContaPoupanca(-1, 0);
    }


    public int procurarPosicaoConta(ContaPoupanca contaPoupanca){
        int i = 0;
        for(ContaPoupanca u : this.cp){
            if(u.getNumConta() == contaPoupanca.getNumConta()){
                return i;
            }
            i++;
        }
        return i; //Se == 10, não encontrou.
    }
}
