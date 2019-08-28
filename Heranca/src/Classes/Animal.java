
package Classes;

public class Animal {
    private String cor;
    private double peso;
    private String olhos;
    private double tamanho;
    
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

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the olhos
     */
    public String getOlhos() {
        return olhos;
    }

    /**
     * @param olhos the olhos to set
     */
    public void setOlhos(String olhos) {
        this.olhos = olhos;
    }

    /**
     * @return the tamanho
     */
    public double getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

}
