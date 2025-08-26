/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.t4t1n.fitgmsport;
import com.t4t1n.fitgmsport.modulos.Entrenamiento;
import com.t4t1n.fitgmsport.recursos.Categoria;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Jaimisky
 */
public class test {
    
    public static void main(String[] args) {
        
        String input = "Trabajo físico intensivo";
        String withoutAccent = StringUtils.stripAccents(input.toUpperCase().replaceAll("\\s", ""));
        System.out.println(withoutAccent);
        
        
       Random r = new Random();
       String randomNumber = String.format("%04d", r.nextInt(1001));
       String randomNumber1 = String.format("%04d", r.nextInt(1001));
       String randomNumber2 = String.format("%04d", r.nextInt(1001));
        System.out.println(randomNumber);
                System.out.println(randomNumber1);
                        System.out.println(randomNumber2);
                        
        String tex = "Competitivo";                
        Categoria text = Categoria.valueOf(tex.toUpperCase());
        Entrenamiento en1 = new Entrenamiento("Trabajo intensio fisico", text);
        
        System.out.println(en1);
    }
    
}


