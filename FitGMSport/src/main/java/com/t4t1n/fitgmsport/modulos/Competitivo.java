
package com.t4t1n.fitgmsport.modulos;

import com.t4t1n.fitgmsport.recursos.Categoria;
import com.t4t1n.fitgmsport.recursos.DescripcionEntrenamiento;


/**
 *
 * @author Jaimisky
 */
public class Competitivo extends Atleta {
    private double peso; // en kilogramos
    private int porcentajeDeGrasa; // Entero ya sera procentaje.
    public Competitivo(){};
    public Competitivo(String nombre, String identificacion, int edad, int estatura, Categoria categoria, DescripcionEntrenamiento entrenamiento, double peso, int porcentajeDeGrasa) {
        super(nombre, identificacion, edad, estatura, categoria, entrenamiento);
        if (peso < 0 ) {
            System.out.println("Error.");
        } else {
            this.peso = peso;
        }
        
        if (porcentajeDeGrasa < 35) {
            System.out.println("Error.");
        } else {
            this.porcentajeDeGrasa = porcentajeDeGrasa;
        }
    }
    
    @Override
    public String toString(){
        return  super.toString() + '\n'+ "Peso:" + peso + '\n' + "Porcentaje de Grasa: " + porcentajeDeGrasa + "\n";
    }
    
    
}
