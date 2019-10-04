package Classes;

public class PicaPau extends Animal implements Ivoar, Ibicar{
    private double tamanhoAsa;
    private double tamanhoBico;

    public PicaPau(double tamanhoAsa, double tamanhoBico, double peso, String cor, String tamanho) {
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
    public void voar() {
        System.out.println("O pica-pau está voando!");
    }

    @Override
    public void bicar() {
        System.out.println("O pica-pau está bicando!");
    }
    
    @Override
    public void comer() {
        System.out.println("O pica pau está comendo!");
    }

    @Override
    public void dormir() {
        System.out.println("O pica pau está dormindo!");
    }
}
