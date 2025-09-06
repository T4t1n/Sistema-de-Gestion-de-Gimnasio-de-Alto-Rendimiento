
package com.t4t1n.fitgmsport.recursos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

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
    
    public static void validarTipoEntrenamiento(String tipoEntrenamiento, String categoriaEntrenamiento ) throws Exception {
        Path ruta = Path.of("Entrenamientos.txt");
        int pos = -1;
        int error = 0;
        try {
            List <String> lista = Files.readAllLines(ruta);
            String im = "";
            
            for (int i = 0; i < lista.size(); i++){
                pos = lista.get(i).indexOf(tipoEntrenamiento);
                if(pos != -1) {
                    im = lista.get(i + 1);
                }
            }
            validate(im,categoriaEntrenamiento);
            System.out.println(im);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
            
        }
        
        
    }
    static void validate(String im, String categoriaEntrenamiento)throws CustomException {
           if(!"Categoria: Recreativo".equals(im) && categoriaEntrenamiento.equals("Recreativo")){
                throw new CustomException("Number must be greater than zero.");
            } 
        }
    
    
    
}
