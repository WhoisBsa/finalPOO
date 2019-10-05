package Classes;

public class Morcego extends Animal implements Ivoar{
    private int qtdDentes;

    public Morcego(int qtdDentes, double peso, String cor, String tamanho) {
        super(peso, cor, tamanho);
        this.qtdDentes = qtdDentes;
    }
    
    public int getQtdDentes() {
        return qtdDentes;
    }

    public void setQtdDentes(int qtdDentes) {
        this.qtdDentes = qtdDentes;
    }
    
    public void empoleirar(){
        System.out.println("O morcego está empoleirando!");
    }
    
    @Override
    public void voar() {
        System.out.println("O morcego está voando!");
    }

    @Override
    public void comer() {
        System.out.println("O morcego está comendo!");
    }

    @Override
    public void dormir() {
        System.out.println("O morcego está dormindo!");
    }
    
}
