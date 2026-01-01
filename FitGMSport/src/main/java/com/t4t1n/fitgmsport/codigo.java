
package com.t4t1n.fitgmsport;

/**
 *
 * @author Jaimisky
 */
public class codigo {
    
    String codigo;
    static int contador = 0;
    
    public codigo(){
        this.codigo = String.format("%04d", contador);
        contador++;
    }
    
    public String getCodigo(){
        return codigo;
    }



}
