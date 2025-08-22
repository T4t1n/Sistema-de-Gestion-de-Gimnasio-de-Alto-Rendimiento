
package com.t4t1n.fitgmsport.principal;

import com.t4t1n.fitgmsport.modulos.Atleta;
import com.t4t1n.fitgmsport.recursos.Categoria;
import com.t4t1n.fitgmsport.recursos.Entrenamiento;
import java.util.Scanner;

/**
 *
 * @author Jaimisky
 */
public class Principal {
    Scanner sc = new Scanner(System.in);
    
    String nombre;
    String identificacion;
    int edad;
    int estatura;
    String categoria;
    String entrenamiento;
    
    Atleta at1;
    
    public void ingresarDatos(){
        System.out.println("Porfavor ingrese los datos: ");
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su identificación: ");
        identificacion = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Ingrese su estatura en cm: ");
        estatura = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su categoria: ");
        categoria = sc.nextLine();
        System.out.println("Ingrese el tipo de entrenamiento: ");
        entrenamiento = sc.nextLine();
        
        creandoObjeto(nombre, identificacion,edad, estatura, categoria, entrenamiento); 
        
    }
    
    public void creandoObjeto(String nombre, String identificacion, int edad, int estatura, String categoria, String entrenamiento) {
        String entrada1 = categoria.toUpperCase();
        
        try{
        Categoria tipo = Categoria.valueOf(entrada1);
        String tipoEn = Entrenamiento.valueOfOrDefault(entrenamiento);
        Entrenamiento tipoEnv2 = Entrenamiento.valueOf(tipoEn);
        at1 = new Atleta(nombre, identificacion, edad, estatura, tipo, tipoEnv2);
        
        }catch(IllegalArgumentException e) {
            System.out.println("Error: valor no valido");
        }
        
        System.out.println(at1.toString());
    }
    
}
