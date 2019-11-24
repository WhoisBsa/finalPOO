
package models;

/**
 *
 * @author hemiliom
 */
public class Eletricista extends Funcionario {
    private String funcao;
    private double salario;
    private String pwd;

    public Eletricista() {
        
    }

    public Eletricista(String nome, String matricula, String turno, String funcao, 
            double salario, String pwd) {
        super(nome, matricula, turno);
        this.funcao = funcao;
        this.pwd = pwd;
        this.salario = salario * 1.3;  // Adicional de 30% por periculosidade.
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
