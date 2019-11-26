
package models;

/**
 *
 * @author hemiliom
 */
public abstract class Funcionario {
    private String nome;
    private String pwd;
    private String matricula;
    private String turno;

    public Funcionario() {
        
    }
    
    public Funcionario(String nome, String matricula, String turno, String pwd) {
        this.nome = nome;
        this.matricula = matricula;
        this.turno = turno;
        this.pwd = pwd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
}