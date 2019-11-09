
package models;

/**
 *
 * @author hemilio
 */
public class Consultas {
    private String data;
    private Pacientes paciente;

    public Consultas(String data, Pacientes paciente) {
        this.data = data;
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }
}
