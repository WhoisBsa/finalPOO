
package classes;

public class Cliente extends Pessoa{
    protected String tipo;
    
    public Cliente(){

    }

    public Cliente(String nome, int idade, String tipo){
        super(nome, idade);
        this.tipo = tipo;
    }
    
    public void mostrarDados(){
        System.out.println(this. nome + " tem " + this.idade + " anos e é do tipo: " + this.tipo);
        System.out.println("");
    }
}