
package com.t4t1n.fitgmsport.modulos;

import com.t4t1n.fitgmsport.recursos.Categoria;
import com.t4t1n.fitgmsport.recursos.Entrenamiento;
import com.t4t1n.fitgmsport.recursos.Objetivo;

/**
 *
 * @author Jaimisky
 */
public class Recreativo extends Atleta{
    
    private Objetivo objetivo;
    
    public Recreativo(){}
    
    public Recreativo(String nombre, String identificacion, int edad, int estatura, Categoria categoria, Entrenamiento entrenamiento, Objetivo objetivo){
        super(nombre, identificacion, edad, estatura, categoria, entrenamiento);
        this.objetivo = objetivo;
    }
    
    @Override
    public String toString(){
        return super.toString() + '\n' + "Objetivo: " + objetivo.getObjetivo();
    }
}
