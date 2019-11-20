
package models;

/**
 *
 * @author hemiliom
 */
public class Eletricista extends Funcionario {
    private String funcao;

    public Eletricista() {
        
    }

    public Eletricista(String nome, String matricula, String turno, String funcao) {
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
