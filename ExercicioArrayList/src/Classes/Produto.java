
package Classes;

import java.util.Comparator;

public class Produto {
    protected String nome;
    protected String marca;
    protected double valor;

    public Produto() {
    
    }
    
    public Produto(String nome, String marca, double valor) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
