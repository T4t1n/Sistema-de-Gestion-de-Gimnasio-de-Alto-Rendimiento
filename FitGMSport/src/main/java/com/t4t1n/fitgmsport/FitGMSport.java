
package com.t4t1n.fitgmsport;

import com.t4t1n.fitgmsport.principal.Principal;
import java.io.IOException;



/**
 *
 * @author Jaimisky
 */
public class FitGMSport {

    public static void main(String[] args) throws IOException {
        
        Principal demo = new Principal();
        demo.ingresarDatos();
        
        
//        String entrada = "competitivo";
//        String entrada1 = entrada.toUpperCase();
//        String entrenamiento = "Entrenamientos individualizados";
//        
//        
//        
//        try{
//        Categoria tipo = Categoria.valueOf(entrada1);
//        String tipoEn = Entrenamiento.valueOfOrDefault(entrenamiento);
//        Entrenamiento tipoEnv2 = Entrenamiento.valueOf(tipoEn);
//        Atleta a1 = new Atleta("Jaimisky Cellez", "702880337", 25, 193, tipo, tipoEnv2);
//        
//        System.out.println(a1.toString());
//        }catch(IllegalArgumentException e) {
//            System.out.println("Error: valor no valido");
//        }
    }   
}
