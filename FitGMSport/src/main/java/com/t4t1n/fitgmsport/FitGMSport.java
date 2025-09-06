
package com.t4t1n.fitgmsport;

import com.t4t1n.fitgmsport.principal.Principal;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



/**
 *
 * @author Jaimisky
 */
public class FitGMSport {
    

    public static void main(String[] args) throws IOException, Exception {
        Scanner sc = new Scanner(System.in);
        Path rutaArchivoEntrenamientos = Paths.get("Entrenamientos.txt");
        Principal demo = new Principal();
        System.out.println("Bienvanid@ a FitGMSport!");
        System.out.println("1. Registrar jugador/es");
        System.out.println("2. Registrar entrenamiento/s");
        System.out.println("3. Salir.");
        
        System.out.println("Elija una opcion:");
        String op = sc.nextLine();
        switch(op) {
            case "1" -> {
                if (Files.exists(rutaArchivoEntrenamientos)){
                    demo.ingresarDatosAtleta();
                }else {
                    System.out.println("Debes tener entrenamientos registrados");
                }
            }
            case "2" -> {System.out.println("Registrar datos:");
                    demo.ingresarDatosEntrenamiento();
            }
            case "3" -> {System.out.println("Saliendo");}
            default -> {System.out.println("elija bien");}
        }
    }   
}
