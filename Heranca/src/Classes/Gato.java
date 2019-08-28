
package Classes;

public class Gato extends Animal{
    public Gato(){
        
    }
    
    public Gato(String cor, double peso, String olhos, double tamanho){
        super(cor,  peso, olhos, tamanho);
    }
    
    public void miar(){
        System.out.println("O gato " + this.cor + " Meauuuuuuuuuuuuu");
    }
}
