/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Comparator;

/**
 *
 * @author hemilio
 */
public class Comparador2000 implements Comparator<Produto> {
    public static final int POR_NOME = 1;
    public static final int POR_ASCE = 2;
    public static final int POR_DESC = 3;
    int tipoComparacao;

    public Comparador2000(int tipoComparacao) {
        this.tipoComparacao = tipoComparacao;
    }
    
    
    @Override
    public int compare(Produto arg0, Produto arg1) {
        switch(this.tipoComparacao){
            case POR_NOME:
                return arg0.getNome().compareTo(arg1.getNome());
            case POR_ASCE:
                if(arg0.getValor() > arg1.getValor()){
                    return 1;
                }
                if(arg1.getValor() > arg0.getValor()){
                    return -1;
                }
                return 0;
            case POR_DESC:
                if(arg0.getValor() > arg1.getValor()){
                    return -1;
                }
                if(arg1.getValor() > arg0.getValor()){
                    return 1;
                }
                return 0;
            default:
                throw new RuntimeException("Opção inválida");
        }
        
    }
    
}
