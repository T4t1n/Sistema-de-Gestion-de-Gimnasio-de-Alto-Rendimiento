
package com.t4t1n.fitgmsport;

import com.t4t1n.fitgmsport.modulos.Atleta;
import com.t4t1n.fitgmsport.recursos.Categoria;


/**
 *
 * @author Jaimisky
 */
public class FitGMSport {

    public static void main(String[] args) {
        
        
        String entrada = "competitivo";
        String entrada1 = entrada.toUpperCase();
        try{
        Categoria tipo = Categoria.valueOf(entrada1);
        Atleta a1 = new Atleta("Jaimisky Cellez", "702880337", 25, 193, tipo);
        
        System.out.println(a1.toString());
        }catch(IllegalArgumentException e) {
            System.out.println("Error: valor no valido");
        }
    }   
}
