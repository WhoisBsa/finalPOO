/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula18.pkg10;

import classes.*;

/**
 *
 * @author robsonresende
 */
public class Aula1810 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        
        carrinho.produtos[0] = new Produto("Xbox one", 1400);
        carrinho.produtos[1] = new Produto("Playstation 4", 2000);
        carrinho.produtos[2] = new Produto("Nintendo Switch", 2800);
        
        boolean excecao = false;
        
        //System.out.println("Nome: " + carrinho.produtos[2].getNome());
        //System.out.println("Valor: " + carrinho.produtos[2].getPreco());
        
        /*try {
          
          carrinho.produtos[2].getNome();
            
          carrinho.listar();
          
        
        }catch(NullPointerException e) {
            
            excecao = true;
            
            for (int i = 0; i < 10; i++) {
                if(carrinho.produtos[i] == null)
                    carrinho.produtos[i] = new Produto();
            }
            
            System.out.println("Gerou exceção, erro: " + e);
            
            carrinho.listar();
        }catch(ArrayIndexOutOfBoundsException e) {
            
            excecao = true;
            
            System.out.println("Tentativa de acesso a um índice inexistente.");
            System.out.println("O índice máximo de produtos é 9!");
        }finally {
            if(excecao)
                System.out.println("Código gerou exceção!");
            else
                System.out.println("Código NÃO gerou exceção!");
        }*/
        
        Calculadora c = new Calculadora();
        
        try {
            System.out.println(c.dividir(4, 0));
        }catch(DivPorZeroException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
