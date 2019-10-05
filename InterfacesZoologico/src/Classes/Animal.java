package Classes;

public abstract class Animal {
    private double peso;
    private String cor;
    private String tamanho;

    public Animal(double peso, String cor, String tamanho) {
        this.peso = peso;
        this.cor = cor;
        this.tamanho = tamanho;
    }
    
    public abstract void comer();
    
    public abstract void dormir();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
