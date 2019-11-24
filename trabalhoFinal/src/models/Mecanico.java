
package models;

/**
 *
 * @author hemiliom
 */
public class Mecanico extends Funcionario{
    private String funcao;
    private double salario;
    private String pwd;

    public Mecanico() {
        
    }

    public Mecanico(String nome, String matricula, String turno, String funcao, 
            double salario, String pwd) {
        super(nome, matricula, turno);
        this.funcao = funcao;
        this.salario = salario;
        this.pwd = pwd; 
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
}
