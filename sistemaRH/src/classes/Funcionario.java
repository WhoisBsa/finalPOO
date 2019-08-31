
package classes;

public class Funcionario extends Pessoa{
    protected double salario;
    protected int codFunc;
    protected String tipoFuncionario;


    public Funcionario(){

    }

    public Funcionario(String nome, int idade, double salario, int codFunc){
        super(nome, idade);
        this.salario = salario;
        this.codFunc = codFunc;
        this.tipoFuncionario = tipoFuncionario;
    }
    
    public void mostrarDados(){
        System.out.println(this. nome + " tem " + this.idade + " anos. Seu código de ");
        System.out.println("");
    }
    
    public void mostrarDados(String tipo){
        System.out.println(this. nome + " tem " + this.idade + " anos. Seu código de " + tipo + " é: " + this.codFunc);
        System.out.println("");
    }
}