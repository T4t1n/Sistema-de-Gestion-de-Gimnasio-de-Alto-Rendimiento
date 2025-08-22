
package com.t4t1n.fitgmsport.recursos;

/**
 *
 * @author Jaimisky
 */
public enum Categoria {
    RECREATIVO ("Recreativo"), 
    COMPETITIVO ("Competitivo"), 
    PROFESIONAL ("Profesional");
    
    
    private String tipo;
    
    
    Categoria (String tipo) {
        
        this.tipo = tipo;
       
    }
   
    public String getTipo(){
        return tipo;
    }
    
   
    
}

