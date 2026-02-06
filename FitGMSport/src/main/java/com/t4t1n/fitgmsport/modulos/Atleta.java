
package com.t4t1n.fitgmsport.modulos;

import com.t4t1n.fitgmsport.recursos.Categoria;
import com.t4t1n.fitgmsport.recursos.Validaciones;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jaimisky
 */


public class Atleta {
    
    private LocalDate fechaRegistro = LocalDate.now();
    private String nombreAtleta;
    private String identificacion;
    private int edad;
   // NumberFormat formatter = new DecimalFormat("#0");
    private int estatura;
    private Categoria categoria;
    private String entrenamientos;
    private List<String> entrenamiento = new ArrayList<>();
    
    String fecha;
    public Atleta() {
    }

    public Atleta(String fecha , String nombre, String identificacion, int edad, int estatura, Categoria categoria, String entrenamientos) {
        this.fecha = fecha;
        this.nombreAtleta = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.estatura = estatura;
        this.categoria = categoria;
        this.entrenamientos = entrenamientos;
    }
    public Atleta(String nombre, String identificacion, int edad, int estatura, Categoria categoria, List<String> entrenamiento ){
        if (Validaciones.validarString(1, nombre)){
            this.nombreAtleta = nombre.toUpperCase();
        }else {
            System.out.println("Nombre no registrado correctamente.");
        }
        
        if (Validaciones.validarString(2, identificacion)){
            this.identificacion = identificacion;
        }else {
            System.out.println("Identificación no registrado correctamente.");
        }
        
        if (Validaciones.validarInt(1, edad)){
            this.edad = edad;
        } else {
            System.out.println("Edad no registrada correctamente");
        }
        if (estatura > 0){
            this.estatura = estatura;
        }else {
            System.out.println("Estatura no registrado correctamente");
        }
        this.categoria = categoria;
        this.entrenamiento = entrenamiento;
                
    }
    
    
    
    public String getFechaRegistro(){
        DateTimeFormatter myFormatWish = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = myFormatWish.format(fechaRegistro);
        return formattedDate;
    }
    
    public String getNombreAtleta(){
        if(nombreAtleta == null) {
        return "No hay nombre registrado";
        }
        return nombreAtleta;
    }
    
    public String getIdetificacion(){
        if(identificacion == null) {
            return "No hay identificacion registrada";
        }
        return identificacion;
    }
    
    public int getEdad(){
//        if(edad = null){
//            System.out.println("No hay edad registrada");
//            return 0;
//        }
        return edad;
    }
    
    public int getEstaura() {
        return estatura;
    }


    public String getEntrenamiento() {
        String texto = "";
        for(int i = 0; i < entrenamiento.size(); i++){
            texto += entrenamiento.get(i);
            texto += ". ";
        }
        return texto;
    }

    public void setEntrenamiento(List<String> entrenamiento) {
        this.entrenamiento = entrenamiento;
    }

   /* @Override
    public String toString() {
        return  '\n' + "Fecha de registro: " + fechaRegistro + '\n' +
                "Nombre del atleta: " + nombreAtleta + '\n' +
                "Identificación: " + identificacion + '\n' + 
                "Edad: " + edad + " años" + '\n' +
                "Estatura: " + estatura + " cm" + '\n' +
                "Categoria: " + categoria.getTipo() + '\n' +
                "Entrenamiento: " + getEntrenamiento();
    }*/

    @Override
    public String toString() {
        return  '\n' + "Fecha de registro: " + fecha + '\n' +
                "Nombre del atleta: " + nombreAtleta + '\n' +
                "Identificación: " + identificacion + '\n' +
                "Edad: " + edad + " años" + '\n' +
                "Estatura: " + estatura + " cm" + '\n' +
                "Categoria: " + categoria.getTipo() + '\n' +
                "Entrenamientos: " + entrenamientos;
    }


        public String showAtleta() {
            return  '\n' + "Fecha de registro: " + fechaRegistro + '\n' +
                    "Nombre del atleta: " + nombreAtleta + '\n' +
                    "Identificación: " + identificacion + '\n' +
                    "Edad: " + edad + " años" + '\n' +
                    "Estatura: " + estatura + " cm" + '\n' +
                    "Categoria: " + categoria.getTipo() + '\n' +
                    "Entrenamiento: " + getEntrenamiento();
        }



    public String writeTXT(){
        return fechaRegistro + "," + nombreAtleta + "," + identificacion + "," + edad + "," + estatura + "," + categoria.getTipo() + "," + getEntrenamiento();
    }

    
}
