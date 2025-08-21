
package com.t4t1n.fitgmsport.modulos;

import com.t4t1n.fitgmsport.recursos.Validaciones;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Jaimisky
 */


public class Atleta {
    
    private LocalDate fechaRegistro = LocalDate.now();
    private String nombreAtleta;
    private String identificacion;
    private double edad;
    NumberFormat formatter = new DecimalFormat("#0");
    private double estatura;
    
    
    
    
    public Atleta() {
        
    }
    public Atleta(String nombre, String identificacion, int edad, int estatura ){
        if (Validaciones.validarString(1, nombre)){
            System.out.println("se realizo exitosamente!");
            this.nombreAtleta = nombre;
        }else {
            System.out.println("Nombre no registrado correctamente.");
        }
        
        if (Validaciones.validarString(2, identificacion)){
            System.out.println("Se realizo exitosamente");
            this.identificacion = identificacion;
        }else {
            System.out.println("Nombre no registrado correctamente.");
        }
        
        if (Validaciones.validarInt(1, edad)){
            System.out.println("Se realizo exitosamente!");
            this.edad = edad;
        } else {
            System.out.println("Edad no registrada correctamente");
        }
        
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
    
    public String getEdad(){
//        if(edad = null){
//            System.out.println("No hay edad registrada");
//            return 0;
//        }
        return formatter.format(edad);
    }
    
}
