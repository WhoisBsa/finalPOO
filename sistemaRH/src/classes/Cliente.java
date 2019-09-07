
package classes;

public class Cliente extends Pessoa{
    private String tipo;
    
    public Cliente(){

    }

    public Cliente(String nome, int idade, String tipo){
        super(nome, idade);
        this.tipo = tipo;
    }
    
    public void mostrarDados(){
        System.out.println(this. nome + " tem " + this.idade + " anos e é do tipo: " + this.getTipo());
        System.out.println("");
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}