
package com.t4t1n.fitgmsport;
import com.t4t1n.fitgmsport.modulos.Atleta;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Jaimisky
 */
public class test {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        List <Atleta> at1 = new ArrayList<>();
        File file = new File("Atletas.txt");
        ObjectInputStream ois = null;
        
        if(file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            at1 = (ArrayList<Atleta>)ois.readObject();
            ois.close();
        }
        
        System.out.println(at1);
        
    }
}