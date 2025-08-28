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
import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Jaimisky
 */
public class test {
    
    public static void main(String[] args) {
        
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
        
        System.out.println("Escribe algo importante");
        String text = sc.nextLine();
        
        try{
            BufferedWriter wf = new BufferedWriter(new FileWriter("notes.txt", true));
            wf.write("Notas de alguien que maneja sus problemas");
            wf.append(text);
            wf.close();
        }catch (Exception e){
            System.out.println(e);
        }
        
        try {
            File file = new File("notes.txt");
            BufferedReader rf = new BufferedReader(new FileReader(file));
            System.out.println(rf.readLine());
            
            rf.close();
        }catch(Exception e) {
            System.out.println(e);
        }
        
        
        
    }
    
}


