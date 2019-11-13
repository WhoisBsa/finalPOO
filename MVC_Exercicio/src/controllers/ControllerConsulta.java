/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Consultas;
import models.DAOConsulta;
import models.Pacientes;

/**
 *
 * @author hemilio
 */
public class ControllerConsulta {
    Consultas c;

    public ControllerConsulta(String data, String cpfPaciente) {
        this.c = new Consultas(data, cpfPaciente);
    }
    
    public void salvar(){
        DAOConsulta dc = new DAOConsulta();
        dc.salvar(c);
    }
    
    
}
