
package com.t4t1n.fitgmsport.modulos;

import com.t4t1n.fitgmsport.recursos.Categoria;
import java.util.Random;

/**
 *
 * @author Jaimisky
 */
public class Entrenamiento {
    private  String codeStart = "GYM";
    private  Random r = new Random();
    private  String codeEnd = String.format("%04d", r.nextInt(1000));
    private  String code = codeStart + codeEnd;
    private  String entrenamiento;
    private Categoria categoriaEntrenamiento;
    
    public Entrenamiento(String entrenamiento, Categoria categoriaEn) {
        this.entrenamiento = entrenamiento;
        this.categoriaEntrenamiento = categoriaEn;
        
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return '\n' + "Codigo: " + code + '\n' + 
                "Entrenamiento: " + entrenamiento + '\n' + 
                "Categoria: " + categoriaEntrenamiento.getTipo() + '\n';
    }

    
}
