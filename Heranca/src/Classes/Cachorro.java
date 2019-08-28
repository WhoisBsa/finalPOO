
package Classes;

public class Cachorro extends Animal{
    
    public Cachorro(){
        
    }
    
    public Cachorro(String cor, double peso, String olhos, double tamanho){
        this.setCor(cor);
        this.setOlhos(olhos);
        this.setPeso(peso);
        this.setTamanho(tamanho);
    }
    
    public void latir(){
        System.out.println("AuAuAuAuAuAu");
    }
}
