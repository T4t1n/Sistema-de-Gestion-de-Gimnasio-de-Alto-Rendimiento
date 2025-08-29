/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.t4t1n.fitgmsport;
import com.t4t1n.fitgmsport.modulos.Entrenamiento;
import com.t4t1n.fitgmsport.recursos.Categoria;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Jaimisky
 */
public class test {
    
    public static void main(String[] args) throws IOException {
        
//        String input = "Trabajo físico intensivo";
//        String withoutAccent = StringUtils.stripAccents(input.toUpperCase().replaceAll("\\s", ""));
//        System.out.println(withoutAccent);
//        
//        
//       Random r = new Random();
//       String randomNumber = String.format("%04d", r.nextInt(1001));
//       String randomNumber1 = String.format("%04d", r.nextInt(1001));
//       String randomNumber2 = String.format("%04d", r.nextInt(1001));
//        System.out.println(randomNumber);
//                System.out.println(randomNumber1);
//                        System.out.println(randomNumber2);
//                        
//        String tex = "Competitivo";                
//        Categoria text = Categoria.valueOf(tex.toUpperCase());
//        Entrenamiento en1 = new Entrenamiento("Trabajo intensio fisico", text);
//        
//        System.out.println(en1);
        
        
        
        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Escribe algo importante");
//        String text = sc.nextLine();
//        
//        try{
//            BufferedWriter wf = new BufferedWriter(new FileWriter("notes.txt", true));
//            wf.write("Notas de alguien que maneja sus problemas");
//            wf.append(text);
//            wf.close();
//        }catch (Exception e){
//            System.out.println(e);
//        }
        
//        try {
//            File file = new File("notes.txt");
//            BufferedReader rf = new BufferedReader(new FileReader(file));
//            System.out.println(rf.readLine());
//            System.out.println(file.getAbsolutePath());
//            
//            rf.close();
//        }catch(Exception e) {
//            System.out.println(e);
//        }



//        String tex = "Competitivo";                
//        Categoria text2 = Categoria.valueOf(tex.toUpperCase());
//        Entrenamiento en1 = new Entrenamiento("Trabajo intensio fisico", text2);
//        Entrenamiento en2 = new Entrenamiento("Trabajo demencial", text2);
//        List<Entrenamiento> Entrenamiento = List.of(en1,en2);
//        List<String> list;
//        String entre = en1.toString();
//        list = List.of(en1.toString(), en2.toString());
//        Path rutaArchivo = Paths.get("notes.txt");
//        Files.write(rutaArchivo, list);
//        String contenido = Files.readString(rutaArchivo);
//        System.out.println(contenido);
        
//        List<Entrenamiento> entrenamientos1;
//        List<String> ListaEn;
//        File file = new File("Hola.txt");
//        int contador = 0;
//        while(contador < 4) {
//            String tex3 = "Competitivo";                
//            Categoria text4 = Categoria.valueOf(tex3.toUpperCase());
//            Entrenamiento en = new Entrenamiento("Trabajo intensio fisico", text4);
//            entrenamientos1 = List.of(en);
//            ListaEn = List.of(en.toString());
//            Path rutaHola = Paths.get("Hola.txt");
//            Files.write(rutaHola, ListaEn);
//            String contenido1 = Files.readString(rutaHola);
//            System.out.println(contenido1);
//            contador++;
//        }
        
        String seguir;
        String descEntrenamiento;
        String categoriaEntre;
        List<Entrenamiento> listaEntrenamientos;
        List<String> listaEntrenamientosTexto = new ArrayList();
        File fileEntrenamientos = new File("Entrenamientos.txt");
        do {
            System.out.println("Escribe la descripcion de el entrenamiento: ");
            descEntrenamiento = sc.nextLine();
            System.out.println("Escribe la categoria a la que pertenecera este entrenamiento");
            categoriaEntre = sc.nextLine();
            Categoria ce = Categoria.valueOf(categoriaEntre.toUpperCase());
            Entrenamiento enGlobal = new Entrenamiento(descEntrenamiento, ce);
            listaEntrenamientos = List.of(enGlobal);
            listaEntrenamientosTexto.add(listaEntrenamientos.toString());
            Path rutaEntrenamientos = Paths.get("Entrenaminetos.txt");
            Files.write(rutaEntrenamientos, listaEntrenamientosTexto);
            System.out.println("Desesa seguir?");
            seguir = sc.nextLine();
            
            
        }while(seguir.equalsIgnoreCase("S"));
        Path rutaEntrenamientos = Paths.get("Entrenaminetos.txt");
        String contenidoEn = Files.readString(rutaEntrenamientos);
        System.out.println(contenidoEn);
        
    }
    
}


