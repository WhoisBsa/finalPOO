
package controllers;

import models.DAOPaciente;
import models.Pacientes;

/**
 *
 * @author hemilio
 */
public class ControllerPacientes {
    Pacientes p;
    
    public ControllerPacientes(String nome, String cpf, String nascimento, String sexo) {
        p = new Pacientes(nome, cpf, nascimento,sexo);
    }
    
    public void salvar() {
        DAOPaciente dp = new DAOPaciente();
        dp.salvar(p);
    }
}
