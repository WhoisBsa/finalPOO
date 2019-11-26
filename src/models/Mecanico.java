
package models;

/**
 *
 * @author hemiliom
 */
public class Mecanico extends Funcionario{
    private String funcao;
    private double salario;

    public Mecanico() {
        
    }

    public Mecanico(String nome, String matricula, String turno, String funcao, 
            double salario, String pwd) {
        super(nome, matricula, turno, pwd);
        this.funcao = funcao;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
