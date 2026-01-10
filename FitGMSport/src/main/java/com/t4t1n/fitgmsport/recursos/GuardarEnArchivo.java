
package com.t4t1n.fitgmsport.recursos;

import com.t4t1n.fitgmsport.modulos.Entrenamiento;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 *
 * @author Jaimisky
 */
public class GuardarEnArchivo {
    static private FileWriter fileWriterDDBB = null;
    static private final String FILE = "Entrenamientos.txt";
    
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


    public static void addProduct(List<Entrenamiento> entrenamientos) {
        try {
            fileWriterDDBB = new FileWriter("EntrenamientosV2.txt", true);
            for(int i=0; i<entrenamientos.size(); i++){
                fileWriterDDBB.write(entrenamientos.get(i).writeTXT()+"\n");
            }

        } catch (IOException e) {
            System.out.println("No hay un archivo");
        } finally {
            try {
                fileWriterDDBB.close();
            } catch (IOException e) {

            }
        }
    }
}
