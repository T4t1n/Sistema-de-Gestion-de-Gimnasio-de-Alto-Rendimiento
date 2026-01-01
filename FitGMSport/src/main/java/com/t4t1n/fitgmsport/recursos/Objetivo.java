
package com.t4t1n.fitgmsport.recursos;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Jaimisky Cellez
 */
public enum Objetivo {
    BAJARDEPESO ("Bajar de peso"),
    MEJORARRESISTENCIA ("Mejorar resistencia"),
    GANARMASAMUSCULAR ("Ganar masa muscular");
    
    private String objetivo;
    
    Objetivo (String objetivo) {
        this.objetivo = objetivo;
    }
    
    public String getObjetivo() {
        return objetivo;
    }
    
    public static String valueOfOrDefault(String userInput) {
        String value = StringUtils.stripAccents(userInput.toUpperCase().replaceAll("\\s", ""));
        for (Objetivo tipo : Objetivo.class.getEnumConstants()){
            if(tipo.name().equalsIgnoreCase(value)){
            return tipo.toString();
            }
        }
        return userInput;
    }
    
}
