
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

import static com.t4t1n.fitgmsport.principal.Principal.menuReportes;


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
        System.out.println("4. Modificar entrenamiento/s");
        System.out.println("5. Reportes del sistema");
        System.out.println("6. Salir.");
        
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
            case "2" -> {System.out.println("Registrar datos entrenamientos:");
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
            case "5" -> {
                System.out.println("Bienvenido/a! puede realizar busquedas y reportes segun lo deseado.");
                System.out.println("1. Filtrar por nombre.");
                System.out.println("2. Filtrar por categoría (Recreativo, Competitivo, Profesional.");
                System.out.println("3. Filtrar por rango de fechas (ejemplo: Atletas registrados entre mayo y junio");
                System.out.println("4. Reporte grupal.");
                System.out.println("5. Salir");
                System.out.println("Elijan una opción: ");
                menuReportes(sc.nextLine());
            }
            case "6" -> {System.out.println("Saliendo");}
            default -> {System.out.println("elija bien");}
        }
    }   
}
