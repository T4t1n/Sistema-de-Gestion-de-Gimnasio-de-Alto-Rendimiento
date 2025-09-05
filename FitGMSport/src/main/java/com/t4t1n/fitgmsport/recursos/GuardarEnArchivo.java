
package com.t4t1n.fitgmsport.recursos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author Jaimisky
 */
public class GuardarEnArchivo {
    
    //*** Metodo estatico que guarda los entrenamientos en archivo Entrenamientos.txt ***
    //** Utilizando la libreria de file y file writer
    public static void entrenamientos(String entrenamiento) throws IOException {
        File Archivo = new File("Entrenamientos.txt");
        try (FileWriter file = new FileWriter("Entrenamientos.txt", true)) {
            file.append(entrenamiento.replaceAll("[\\[\\]]+", ""));
            System.out.println("Se realizo exitosamente el registro del entrenamiento");
        }
    }
    
    //*** Metodo estatico que que guarda los atletas en archivo Atletas.txt ***
    //** Utilizando la libreria de file y path, paths.
    public static void atletas(String atleta) throws IOException {
        File Archivo = new File("Atletas.txt");
        Path rutaAtletaArchivo = Paths.get("Atletas.txt");
        if(Files.exists(rutaAtletaArchivo) == false) {
        Files.createFile(rutaAtletaArchivo);
        Files.writeString(rutaAtletaArchivo, atleta.replaceAll("[\\[\\]]+", ""), StandardOpenOption.APPEND);
        System.out.println("Se realizo exitosamente el registro del atleta");
        } else {
        Files.writeString(rutaAtletaArchivo, atleta.replaceAll("[\\[\\]]+", ""), StandardOpenOption.APPEND);
        System.out.println("Se realizo exitosamente el registro del atleta");
        }
    }
    
}
