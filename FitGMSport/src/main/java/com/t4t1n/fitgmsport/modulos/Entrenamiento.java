
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

    public Entrenamiento(String code, String tipoEntrenamiento, Categoria categoria){
        this.code = code;
        this.entrenamiento = tipoEntrenamiento;
        this.categoriaEntrenamiento = categoria;
    }


    public String getCode() {
        return code;
    }

    public String getEntrenamiento(){
        return this.entrenamiento;
    }

    public void setEntrenamiento(String entrenamiento) {
        this.entrenamiento = entrenamiento;
    }

    public Categoria getCategoriaEntrenamiento() {
        return this.categoriaEntrenamiento;
    }

    public void setCategoriaEntrenamiento(Categoria categoria) {
        this.categoriaEntrenamiento = categoria;
    }

    @Override
    public String toString() {
        return '\n' + "Codigo: " + code + '\n' + 
                "Entrenamiento: " + entrenamiento + '\n' + 
                "Categoria: " + categoriaEntrenamiento.getTipo() + '\n';
    }

    //Esto es para probar una forma de guardar. //Realizado el 7 de enero del 2026
    public String writeTXT(){
        return getCode() + "," + entrenamiento + "," + categoriaEntrenamiento.getTipo();
    }

    
}
