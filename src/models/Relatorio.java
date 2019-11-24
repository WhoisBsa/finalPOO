
package models;

/**
 *
 * @author hemiliom
 */
public class Relatorio {
    private String id;
    private String aplicacao;
    private String matricula;
    private String dataInicio;
    private String dataFim;
    private String horaInicio;
    private String horaFim;
    private String observacoes;
    private String codMaterial;
    private int qtdMaterial;
    private String numOs;

    
    public Relatorio() {
    
    }
    
    
    public Relatorio(String aplicacao, String matricula, String dataInicio, 
            String dataFim, String horaInicio, String horaFim, 
            String observacoes, String codMaterial, int qtdMaterial, String numOs) {
        
        this.aplicacao = aplicacao;
        this.matricula = matricula;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.observacoes = observacoes;
        this.codMaterial = codMaterial;
        this.qtdMaterial = qtdMaterial;
        this.numOs = numOs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
    
    public String getAplicacao() {
        return aplicacao;
    }

    
    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

    
    public String getMatricula() {
        return matricula;
    }

    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    public String getDataInicio() {
        return dataInicio;
    }

    
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    
    public String getDataFim() {
        return dataFim;
    }

    
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    
    public String getHoraInicio() {
        return horaInicio;
    }

    
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    
    public String getHoraFim() {
        return horaFim;
    }

    
    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    
    public String getObservacoes() {
        return observacoes;
    }

    
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
    public String getCodMaterial() {
        return codMaterial;
    }

    
    public void setCodMaterial(String codMaterial) {
        this.codMaterial = codMaterial;
    }

    
    public int getQtdMaterial() {
        return qtdMaterial;
    }

    
    public void setQtdMaterial(int qtdMaterial) {
        this.qtdMaterial = qtdMaterial;
    }

    
    public String getNumOs() {
        return numOs;
    }

    
    public void setNumOs(String numOs) {
        this.numOs = numOs;
    }
    
}
