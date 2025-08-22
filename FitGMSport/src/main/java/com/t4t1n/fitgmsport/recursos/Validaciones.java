
package com.t4t1n.fitgmsport.recursos;

/**
 *
 * @Jaimisky
 */
public abstract class Validaciones {
    
    public static boolean validarString(int tipoDeValidacion, String valor){
        
        
        switch(tipoDeValidacion){
            case 1:  return valor.matches("^(?=.{4,20}$)([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$");
            case 2: return valor.matches("^(?=.{9}$)(\\d)*$");
            default: return false;
                
        }   
    }
    
    public static boolean validarInt(int tipoDeValidacion, int valor) {
        switch(tipoDeValidacion) {
            case 1: return valor > 12 && valor < 60;
            default: return false;
        }
    }
    
}
