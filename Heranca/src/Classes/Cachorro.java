
package Classes;

public class Cachorro extends Animal{
    
    public Cachorro(){
        
    }
    
    public Cachorro(String cor, double peso, String olhos, double tamanho){
        this.cor = cor;
        this.olhos = olhos;
        this.peso = peso;
        this.tamanho = tamanho;
    }
    
    
    //sobrescreve método da superclasse
    @Override
    public void movimentar(){
        System.out.println("O gato " + this.cor);
        super.movimentar();
    }
    
    public void latir(){
        System.out.println("AuAuAuAuAuAu");
    }
}
