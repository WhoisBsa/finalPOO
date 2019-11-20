
package models;

/**
 *
 * @author hemiliom
 */
public class Mecanico extends Funcionario{
    private String funcao;

    public Mecanico() {
        
    }

    public Mecanico(String nome, String matricula, String turno, String funcao) {
        super(nome, matricula, turno);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
   
    
}
