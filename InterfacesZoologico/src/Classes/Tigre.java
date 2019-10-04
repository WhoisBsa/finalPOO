package Classes;

public class Tigre extends Animal implements Icorrer{
    private int qtdPatas;
    private double tamanhoRabo;

    public Tigre(int qtdPatas, double tamanhoRabo, double peso, String cor, String tamanho) {
        super(peso, cor, tamanho);
        this.qtdPatas = qtdPatas;
        this.tamanhoRabo = tamanhoRabo;
    }
    
    @Override
    public void correr() {
        System.out.println("O tigre está correndo!");
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
    public void comer() {
        System.out.println("O tigre está comendo!");
    }

    @Override
    public void dormir() {
        System.out.println("O tigre está dormindo!");
    }
}
