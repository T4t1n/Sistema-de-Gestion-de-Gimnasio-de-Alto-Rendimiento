
package com.t4t1n.fitgmsport;

import com.t4t1n.fitgmsport.modulos.Atleta;


/**
 *
 * @author Jaimisky
 */
public class FitGMSport {

    public static void main(String[] args) {
        Atleta a1 = new Atleta("Jaimisky Cellez", "702880337", 25);
        
        System.out.println(a1.getFechaRegistro());
        System.out.println(a1.getNombreAtleta());
        System.out.println(a1.getIdetificacion());
        System.out.println(a1.getEdad());
        System.out.println("Hello World!");
        
    }
}
