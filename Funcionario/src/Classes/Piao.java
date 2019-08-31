
package Classes;

public class Piao extends Funcionario {
    
    public Piao(){
        
    }
    
    public Piao(String funcao, int idade, double salario){
        super(funcao, idade, salario);
    }
    
    public void trabalhar(){
        System.out.println("Trabalhando igual burro!");
    }
    
}
