package Classes;

public class Macaco extends Animal implements Icorrer, Iescalar{
    private int qtdPatas;
    private double tamanhoRabo;

    public Macaco(int qtdPatas, double tamanhoRabo, double peso, String cor, String tamanho) {
        super(peso, cor, tamanho);
        this.qtdPatas = qtdPatas;
        this.tamanhoRabo = tamanhoRabo;
    }
    
    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public double getTamanhoRabo() {
        return tamanhoRabo;
    }

    public void setTamanhoRabo(double tamanhoRabo) {
        this.tamanhoRabo = tamanhoRabo;
    }

    @Override
    public void correr() {
        System.out.println("O macaco está correndo!");
    }
    
    @Override
    public void escalar() {
        System.out.println("O macaco está escalando!");
    }
    
    @Override
    public void comer() {
        System.out.println("O macaco está comendo!");
    }

    @Override
    public void dormir() {
        System.out.println("O macaco está dormindo!");
    }
}
