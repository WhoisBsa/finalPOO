/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.ResultSet;
import models.DAORelatorio;
import models.Relatorio;

/**
 *
 * @author matheus
 */
public class RelatorioController {
    private Relatorio r;
    private DAORelatorio dr;
    
    public RelatorioController() {
        r = new Relatorio();
    }
    
    public RelatorioController(Relatorio r) {
        this.r = r;
    }
    
    public RelatorioController(String aplicacao, String matricula, String dataInicio, 
            String dataFim, String horaInicio, String horaFim, 
            String observacoes, String codMaterial, int qtdMaterial, String numOs) {
        
        r = new Relatorio(aplicacao, matricula, dataInicio, dataFim, horaInicio, 
                horaFim, observacoes, codMaterial, qtdMaterial, numOs);
    }
    
    public String salvar() {
        return dr.salvar(r);
    }
    
    public String remover(int id) {
        return dr.delete(id);
    }
    
    public String atualizar(int id) {
        return dr.atualizar(r.getAplicacao(), r.getMatricula(), r.getDataInicio(),
            r.getDataInicio(), r.getHoraInicio(), r.getHoraFim(), r.getObservacoes(),
            r.getCodMaterial(), r.getQtdMaterial(), r.getNumOs(), id);
    }
    
    public ResultSet vizualizar(int id) {
        return dr.visualizar(id);
    }
}
