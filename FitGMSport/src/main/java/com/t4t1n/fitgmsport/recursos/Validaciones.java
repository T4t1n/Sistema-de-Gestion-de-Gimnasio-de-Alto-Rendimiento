
package com.t4t1n.fitgmsport.recursos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @Jaimisky
 */
public abstract class Validaciones {
    
    public static boolean validarString(int tipoDeValidacion, String valor){
        
        
        switch(tipoDeValidacion){
            //case 1:  return valor.matches("^(?=.{4,20}$)([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$");
            case 1:  return valor.matches("^(?=.{4,30}$)([a-zà-ÿçñ]+)(\\s[a-zà-ÿçñ]+)*$");
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

    public static void validarEntrenamiento(String en, String cate) {
        Path ruta = Paths.get("Entrenamientos.txt");
        int counter = 0;
        String im = "";

        try {

            List<String> lines = Files.readAllLines(ruta);
            for(String line : lines) {
                if (line.contains(en)) {
                    String[] parts = line.split(",");
                    im = parts[2].trim();

                }
            }
            System.out.println(im);
            validate(im, cate);
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
    static void validate(String im, String categoriaJugador)throws CustomException {
          /* if(!"Recreativo".equals(im) && categoriaJugador.equals("Recreativo")){
                throw new CustomException("Number must be greater than zero. esto remal");
            }  i dont know what i will want do it with this!*/

        if(!im.equalsIgnoreCase(categoriaJugador)) {
            throw new CustomException("Number must be greater than zero. esto remal");
        }
        }
}
