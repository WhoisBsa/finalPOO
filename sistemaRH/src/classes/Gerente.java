
package classes;

public class Gerente extends Funcionario{
    private int qtdFuncGerenciados;
    
    public Gerente(){
        
    }
    
    public Gerente(String nome, int idade, double salario, int codFunc, int qtdFuncGerenciados){
        super(nome, idade, salario, codFunc);
        this.qtdFuncGerenciados = qtdFuncGerenciados;        
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados("gerente");
        System.out.println("Este gerente gerencia " + this.qtdFuncGerenciados + " funcionários");
    }
    
}
