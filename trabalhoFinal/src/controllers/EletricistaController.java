
package controllers;

import java.sql.ResultSet;
import models.DAOEletricista;
import models.Eletricista;

/**
 *
 * @author hemiliom
 */
public class EletricistaController {
    private Eletricista e;
    private DAOEletricista de;
    
    public EletricistaController() {
        e = new Eletricista();
    }
    
    public EletricistaController(Eletricista e) {
        this.e = e;
    }
    
    public EletricistaController(String nome, String matricula, String turno, 
            String funcao, double salario, String pwd) {
        e = new Eletricista(nome, matricula, turno, funcao, salario, pwd);
    }
    
    public String salvar() {
        return de.salvar(e);
    }
    
    public String remover(String matricula) {
        return de.delete(matricula);
    }
    
    public String atualizar(String matricula) {
        return de.atualizar(e.getNome(), e.getFuncao(), e.getTurno(), 
                e.getSalario(), e.getPwd(), e.getMatricula());
    }
    
    public ResultSet vizualizar(String matricula) {
        return de.visualizar(matricula);
    }
}
