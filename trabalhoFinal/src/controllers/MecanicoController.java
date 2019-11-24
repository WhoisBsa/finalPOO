/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.DAOMecanico;
import models.Mecanico;
import java.sql.ResultSet;


/**
 *
 * @author hemiliom
 */
public class MecanicoController {
    private Mecanico m;
    private DAOMecanico dm;
    
    public MecanicoController() {
        m = new Mecanico();
    }
    
    public MecanicoController(Mecanico m) {
        this.m = m;
    }
    
    public MecanicoController(String nome, String matricula, String turno, 
            String funcao, double salario, String pwd) {
        m = new Mecanico(nome, matricula, turno, funcao, salario, pwd);
    }
    
    public String salvar() {
        return dm.salvar(m);
    }
    
    public String remover(String matricula) {
        return dm.delete(matricula);
    }
    
    public String atualizar(String matricula) {
        return dm.atualizar(m.getNome(), m.getFuncao(), m.getTurno(), 
                m.getSalario(), m.getPwd(), m.getMatricula());
    }
    
    public ResultSet vizualizar(String matricula) {
        return dm.visualizar(matricula);
    }
}
