package Classes;

public class Avestruz extends Animal implements Icorrer, Ibicar{
    private double tamanhoAsa;
    private double tamanhoBico;

    public Avestruz(double tamanhoAsa, double tamanhoBico, double peso, String cor, String tamanho) {
        super(peso, cor, tamanho);
        this.tamanhoAsa = tamanhoAsa;
        this.tamanhoBico = tamanhoBico;
    }

    public double getTamanhoAsa() {
        return tamanhoAsa;
    }

    public void setTamanhoAsa(double tamanhoAsa) {
        this.tamanhoAsa = tamanhoAsa;
    }

    public double getTamanhoBico() {
        return tamanhoBico;
    }

    public void setTamanhoBico(double tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }

    @Override
    public void correr() {
        System.out.println("O avestruz está correndo!");
    }

    @Override
    public void bicar() {
        System.out.println("O avestruz está bicando!");
    }
    
    @Override
    public void comer() {
        System.out.println("O avestruz está comendo!");
    }

    @Override
    public void dormir() {
        System.out.println("O avestruz está dormindo!");
    }
}
