
package models;

/**
 *
 * @author hemilio
 */
public class Consultas {
    private String data;
    private String cpfPaciente;

    public Consultas(String data, String cpfPaciente) {
        this.data = data;
        this.cpfPaciente = cpfPaciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }
}
