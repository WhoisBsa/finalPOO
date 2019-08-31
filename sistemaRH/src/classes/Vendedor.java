/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author hemilio
 */
public class Vendedor extends Funcionario{
    protected int qtdVendas;
    
    public Vendedor(){
        
    }
    
    public Vendedor(String nome, int idade, double salario, int codFunc, int qtdVendas){
        super(nome, idade, salario, codFunc);
        this.qtdVendas = qtdVendas;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados("vendedor");
        System.out.println("Este funcionário efetuou " + this.qtdVendas + " vendas");
    }
    
}
