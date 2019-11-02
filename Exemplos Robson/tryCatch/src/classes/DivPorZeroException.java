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
public class DivPorZeroException extends Exception{
    
    @Override
    public String getMessage() {
        return "Não é possível dividir por zero! Insira outro valor!";
    }
}
