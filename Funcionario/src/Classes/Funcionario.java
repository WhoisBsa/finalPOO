
package Classes;

public class Funcionario {
    protected String funcao;
    protected int idade;
    protected double salario;
    
    public Funcionario(){
        
    }
    
    public Funcionario(String funcao, int idade, double salario){
        this.funcao = funcao;
        this.idade = idade;
        this.salario = salario;
        
    }
    

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void baterPonto(){
        System.out.println("Ponto registrado!");
    }
    
}
