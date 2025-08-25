
package com.t4t1n.fitgmsport.modulos;

import java.util.Random;

/**
 *
 * @author Jaimisky
 */
public class Entrenamiento {
    private String codeStart = "GYM";
    private String codeEnd = "0000";
    private String codeEnd = createCode(codeEnd);
    

    public String getCodeStart() {
        return codeStart;
    }

    public void setCodeStart(String codeStart) {
        this.codeStart = codeStart;
    }



    @Override
    public String toString() {
        return "Entrenamiento{" + "codeStart=" + codeStart + ", codeEnd=" + codeEnd + '}';
    }
    
    public String createCode(String codeEnd){
      Integer i = Integer.parseInt(s);
      i++;
      s = String.format("%0" + s.length() + "d", i);
      return s;
      }
    }
    
    
}
