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
public class Calculadora {
    public double dividir(double a, double b) throws DivPorZeroException{ 
        if(b==0)
            throw new DivPorZeroException();
        
        double resultado = a/b;
        
        return resultado;
    }
}
