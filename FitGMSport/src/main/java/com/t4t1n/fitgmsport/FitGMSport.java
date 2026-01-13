
package com.t4t1n.fitgmsport;

import com.t4t1n.fitgmsport.modulos.Entrenamiento;
import com.t4t1n.fitgmsport.principal.Principal;
import com.t4t1n.fitgmsport.recursos.GuardarEnArchivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Jaimisky
 */
public class FitGMSport {
    

    public static void main(String[] args) throws IOException, Exception {
        ArrayList<Entrenamiento> entrenamientos = GuardarEnArchivo.obtenerTodoEntrenamiento();
        Scanner sc = new Scanner(System.in);
        Path rutaArchivoEntrenamientos = Paths.get("Entrenamientos.txt");
        Principal demo = new Principal();
        System.out.println("Bienvanid@ a FitGMSport!");
        System.out.println("1. Registrar jugador/es");
        System.out.println("2. Registrar entrenamiento/s");
        System.out.println("3. Eliminar entrenamiento/s");
        System.out.println("4. Salir.");
        
        System.out.println("Elija una opción:");
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
            case "3" -> {
                System.out.println("Eliminar entrenamiento:");

                demo.eliminarEntrenamiento(entrenamientos);
            }
            case "4" -> {
                System.out.println("Modificar entrenamiento:");
                demo.modificarEntrenamiento(entrenamientos);
            }
            case "5" -> {System.out.println("Saliendo");}
            default -> {System.out.println("elija bien");}
        }
    }   
}
