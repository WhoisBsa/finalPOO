/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import models.Pacientes;

/**
 *
 * @author hemilio
 */
public class MVC_Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Pacientes p = new Pacientes("José", "123123123123", "18/11/1991", 'M');
        
        System.out.println(p.idade());
    }
}
