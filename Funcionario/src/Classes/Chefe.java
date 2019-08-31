
package Classes;

public class Chefe extends Funcionario {
    public Chefe(){
        
    }
    
    public Chefe(String funcao, int idade, double salario){
        super(funcao, idade, salario);
    }
    
    @Override
    public void baterPonto(){
        System.out.println("Ponto registrado minha altesa!");
    }
    
    public void mandar(){
        System.out.println("Vai trabalhar vagabundo!");
    }
}
