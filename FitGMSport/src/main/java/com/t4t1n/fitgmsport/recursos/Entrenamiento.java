
package com.t4t1n.fitgmsport.recursos;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Jaimisy
 */
public enum Entrenamiento {
    PROGRESIONHACIALACOMPETICION ("Progresión hacia la competición"),
    ENTRENAMIENTOSINDIVIDUALIZADOS ("Entrenamientos individualizados"),
    TRABAJOFISICOINTENSIVO ("Trabajo físico intensivo");
    
    
    
    private String tipoEntrenamiento;
    
    Entrenamiento(String tipoEntrenamiento){
        this.tipoEntrenamiento = tipoEntrenamiento;
    }
            
    public String getTipoEntrenamiento() {
        return tipoEntrenamiento;
    }
            
    public static String valueOfOrDefault(String userInput) {
        String value = StringUtils.stripAccents(userInput.toUpperCase().replaceAll("\\s", ""));
        for (Entrenamiento tipo : Entrenamiento.class.getEnumConstants()){
            if(tipo.name().equalsIgnoreCase(value)){
            return tipo.toString();
            }
        }
        return userInput;
    }
    
    
    
}
