
package com.t4t1n.fitgmsport.recursos;

import com.t4t1n.fitgmsport.modulos.Atleta;
import com.t4t1n.fitgmsport.modulos.Entrenamiento;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

/**
 *
 * @author Jaimisky
 */
public class GuardarEnArchivo {
    //static private FileWriter fileWriterDDBB = null;
    static private FileReader fileReaderDDBB = null;
    static private BufferedReader bufferedReaderDDBB = null;
    static private final String FILE = "Entrenamientos.txt";
    static private final String FILEATLETH = "Atletasv1.txt";
    
  /*  //*** Metodo estatico que guarda los entrenamientos en archivo Entrenamientos.txt ***
    //** Utilizando la libreria de file y file writer
    public static void entrenamientos(String entrenamiento) throws IOException {
        File Archivo = new File("Entrenamientos.txt");
        try (FileWriter file = new FileWriter("Entrenamientos.txt", true)) {
            file.append(entrenamiento.replaceAll("[\\[\\]]+", ""));
            System.out.println("Se realizo exitosamente el registro del entrenamiento");
        }
    }*/
    
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

    public static void añadirAtletas(List<Atleta> atletas) {
        try(FileWriter fileWriterDDBB = new FileWriter(FILEATLETH, true)) {
            for(int i= 0; i < atletas.size(); i++){
                fileWriterDDBB.write(atletas.get(i).writeTXT() + "\n");
            }
        }catch (IOException e) {
            System.out.println("No hay archivo");
        }
    }




    //This method is the actual to save entrenamientos created.
    public static void anadirEntrenamientos(List<Entrenamiento> entrenamientos) {
        try(FileWriter fileWriterDDBB = new FileWriter(FILE, true)) {
            //fileWriterDDBB = new FileWriter("EntrenamientosV2.txt", true);
            for(int i=0; i<entrenamientos.size(); i++){
                fileWriterDDBB.write(entrenamientos.get(i).writeTXT()+"\n");
            }
        } catch (IOException e) {
            System.out.println("No hay un archivo");
        }
    }

    public static ArrayList<Atleta> obtenerTodoAtleta(){
        ArrayList<Atleta> nuevosAtletas = new ArrayList<>();
        try {
            fileReaderDDBB = new FileReader(FILEATLETH);
            bufferedReaderDDBB = new BufferedReader(fileReaderDDBB);
            String line = "";
            while((line = bufferedReaderDDBB.readLine()) != null) {
                String[] parts = line.split(",");
                String fecha = parts[0];
                String nombre = parts[1];
                String id = parts[2];
                int edad = Integer.parseInt(parts[3]);
                int altura = Integer.parseInt(parts[4]);
                Categoria categoriaAtleta = Categoria.valueOf(parts[5].toUpperCase());
                String entrenamiento = parts[6];
                Atleta ath1 = new Atleta(fecha,nombre,id,edad,altura, categoriaAtleta, entrenamiento);
                switch (categoriaAtleta) {
                    case RECREATIVO -> {


                    }
                }
                nuevosAtletas.add(ath1);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        return nuevosAtletas;
    }

    public static ArrayList<Entrenamiento> obtenerTodoEntrenamiento() {
        ArrayList<Entrenamiento> nuevosEntrenamientos = new ArrayList<>();
        try{
            fileReaderDDBB = new FileReader(FILE);
            bufferedReaderDDBB = new BufferedReader(fileReaderDDBB);
            String line = "";
            while((line = bufferedReaderDDBB.readLine()) != null) {
                String[] parts = line.split(",");
                String code = parts[0];
                String tipoEntrenamiento = parts[1];
                Categoria categoriaEntrenamiento = Categoria.valueOf(parts[2].toUpperCase());
                Entrenamiento entrenamiento = new Entrenamiento(code, tipoEntrenamiento, categoriaEntrenamiento);
                nuevosEntrenamientos.add(entrenamiento);
            }
        }catch(FileNotFoundException fnfe){
            System.out.println("There is no such file");
        }catch(IOException e) {
            System.out.println("Something happend with the file");
        }catch (ArrayIndexOutOfBoundsException siobe){
            System.out.println("The are extra blank lines in the file");
        }catch (NumberFormatException nfe){
            System.out.println("The are extra blank lines in the file");
        }/*finally {
            try {
                fileReaderDDBB.close();
                bufferedReaderDDBB.close();
            }catch(IOException e) {

            }
        }*/
        return nuevosEntrenamientos;
    }

    public static void actualizarEntrenamientos(List<Entrenamiento> entrenamientos) {
        try(FileWriter fileWriterDDBB = new FileWriter(FILE)){
            for(int i= 0; i < entrenamientos.size(); i++) {
                fileWriterDDBB.write(entrenamientos.get(i).writeTXT()+"\n");
            }
        }catch(IOException e) {
            System.out.println("No hay archivo.");
        }
    }





}
