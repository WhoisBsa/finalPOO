package Classes;

public class Preguica extends Animal implements Iescalar{
    private int horasDormidas;

    public Preguica(double peso, String cor, String tamanho, int horasDormidas) {
        super(peso, cor, tamanho);
        this.horasDormidas = horasDormidas;
    }
    
    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }
    
    @Override
    public void escalar() {
        System.out.println("A preguiça está escalando!");
    }
    
    @Override
    public void comer() {
        System.out.println("O preguiça está comendo!");
    }

    @Override
    public void dormir() {
        System.out.println("O preguiça está dormindo!");
    }
    
}
