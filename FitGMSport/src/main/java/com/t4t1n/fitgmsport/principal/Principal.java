
package com.t4t1n.fitgmsport.principal;

import com.t4t1n.fitgmsport.modulos.Atleta;
import com.t4t1n.fitgmsport.modulos.Competitivo;
import com.t4t1n.fitgmsport.modulos.Entrenamiento;
import com.t4t1n.fitgmsport.modulos.Profesional;
import com.t4t1n.fitgmsport.modulos.Recreativo;
import com.t4t1n.fitgmsport.recursos.Categoria;
import com.t4t1n.fitgmsport.recursos.DescripcionEntrenamiento;
import com.t4t1n.fitgmsport.recursos.GuardarEnArchivo;
import com.t4t1n.fitgmsport.recursos.Objetivo;
import com.t4t1n.fitgmsport.recursos.Validaciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Jaimisky
 */
public class Principal {
    Scanner sc = new Scanner(System.in);
    
    // variables para almacenar datos de usuario
    String nombre;
    String identificacion;
    int edad;
    int estatura;
    String categoria;
    String entrenamiento;
    double peso;
    int porcentajeDeGrasa;
    
    // variables para almacenar datos de entrenamientos
    String tipoEntrenamiento;
    String categoriaEntrenamiento;
    
    
    Atleta at1;
    List<Atleta> atleta = new ArrayList<>();
    List<String> atletaTxt = new ArrayList<>(); 
    String atletaTexto; 
    
    
    
    List<Entrenamiento> en = new ArrayList<>();
    List<String> entxt = new ArrayList<>();
    String last;
    
    public void ingresarDatosAtleta() throws IOException, Exception{
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
        
        Validaciones.validarTipoEntrenamiento(entrenamiento, categoria);
        
        creandoObjeto(nombre, identificacion,edad, estatura, categoria, entrenamiento, peso, porcentajeDeGrasa); 
        
    }
    
    public void creandoObjeto(String nombre, String identificacion, int edad, int estatura, String categoria, String entrenamiento, double peso, int porcentaje) throws IOException {
        String entrada1 = categoria.toUpperCase();
        
        try{
        Categoria tipo = Categoria.valueOf(entrada1);
        String tipoEn = DescripcionEntrenamiento.valueOfOrDefault(entrenamiento);
        
        
           switch(tipo){
               case RECREATIVO -> {
                   System.out.println("Inserta tu objetivo:");
                   String objetivo = sc.nextLine();
                   String tipoObj = Objetivo.valueOfOrDefault(objetivo);
                   Objetivo obv2 = Objetivo.valueOf(tipoObj);
                   atleta.add( new Recreativo(nombre, identificacion, edad, estatura, tipo, entrenamiento, obv2));
               }
               case PROFESIONAL -> {
                   System.out.println("Digite el peso en kilogramos: ");
                   peso = sc.nextDouble();
                   //sc.nextLine();
                   System.out.println("Digite el porcetaje de grasa del atleta: ");
                   porcentajeDeGrasa = sc.nextInt();
                   atleta.add(new Profesional(nombre, identificacion, edad, estatura, tipo, entrenamiento, peso, porcentajeDeGrasa));
               }
               case COMPETITIVO -> {
                   System.out.println("Digite el peso en kilogramos: ");
                   peso = sc.nextDouble();
                   sc.nextLine();
                   System.out.println("Digite el porcetaje de grasa del atleta: ");
                   porcentajeDeGrasa = sc.nextInt();
                   atleta.add(new Competitivo(nombre, identificacion, edad, estatura, tipo, entrenamiento, peso, porcentajeDeGrasa));
               }
               default -> {
                   System.out.println("No existe esa categoria o digitos mal ingresados.");
               }
           }
           
           atletaTxt.add(atleta.toString());
           atletaTexto = atletaTxt.getLast();
           GuardarEnArchivo.atletas(atletaTexto);
        
        }catch(IllegalArgumentException e) {
            System.out.println("Error: valor de categoria o tipo de entrenamiento no valido.");
        }
        
        try {
        System.out.println(atleta.toString());
        }catch(NullPointerException e) {
            System.out.println("Como hay un error no se pudo imprimir.");
        }
    }

    // Method to ask for data and finally save.
    public void ingresarDatosEntrenamiento() {
        System.out.println("Porfavor ingrese los siguientes datos: ");
        System.out.println("Ingrese el tipo de entrenamientos");
        tipoEntrenamiento = sc.nextLine();
        System.out.println("Ingrese la categoria del entrenamiento: ");
        categoriaEntrenamiento = sc.nextLine();
            Categoria categoriaValidation = Categoria.valueOf(categoriaEntrenamiento.toUpperCase());
            en.add(new Entrenamiento(tipoEntrenamiento, categoriaValidation));
            entxt.add(en.toString());
            last = entxt.getLast();

            Entrenamiento entrenamiento = new Entrenamiento(tipoEntrenamiento, categoriaValidation);
            ArrayList<Entrenamiento> entrenamientos = new ArrayList<>();
            entrenamientos.add(entrenamiento);
            GuardarEnArchivo.addProduct(new ArrayList<Entrenamiento>(Arrays.asList(entrenamiento)));



        try {
            GuardarEnArchivo.entrenamientos(last);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    // Method to ask for name and finally delete a training
    public void ingresarDatosParaEliminar(){
        System.out.println("Porfavor ingrese el codigo del entreamiento: ");
        String codigoABuscar = sc.nextLine();
    }

    public static ArrayList<String> cargarEntrenamientos() {
        ArrayList<String> entrenamientosInformacionLista = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("Entrenamientos.txt"))) {
            String line;
            while ((line =  reader.readLine()) != null) {
                entrenamientosInformacionLista.add(line);
            }
            return entrenamientosInformacionLista;

        }catch(IOException e){
            System.out.println("Error" + e);
            return new ArrayList<String>();
        }
    }
}


