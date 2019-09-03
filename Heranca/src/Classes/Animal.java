
package Classes;

public class Animal {
    protected String cor;
    protected double peso;
    protected String olhos;
    protected double tamanho;
    
    public Animal(){
        
    }
    
    public Animal(String cor, double peso, String olhos, double tamanho){
        this.cor = cor;
        this.peso = peso;
        this.olhos = olhos;
        this.tamanho = tamanho;
    }
    
    public void movimentar(){
        System.out.println("Animal Movimentando!");
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getOlhos() {
        return olhos;
    }

    public void setOlhos(String olhos) {
        this.olhos = olhos;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

}
