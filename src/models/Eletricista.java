
package models;

/**
 *
 * @author hemiliom
 */
public class Eletricista extends Funcionario {
    private String funcao;
    private double salario;

    public Eletricista() {
        
    }
    
    public Eletricista(String matricula, String pwd) {
        super(matricula, pwd);
    }

    public Eletricista(String nome, String matricula, String turno, String funcao, 
            double salario, String pwd) {
        super(nome, matricula, turno, pwd);
        this.funcao = funcao;
        this.salario = salario * 1.3;  // Adicional de 30% por periculosidade.
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
