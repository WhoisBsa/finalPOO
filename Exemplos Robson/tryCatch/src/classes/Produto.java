/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author robsonresende
 */
public class Produto {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    private String nome;
    private double preco;
    
    public Produto(){}
    
    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
