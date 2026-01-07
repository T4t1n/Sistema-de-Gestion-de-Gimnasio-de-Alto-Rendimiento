
package com.t4t1n.fitgmsport;
import com.t4t1n.fitgmsport.modulos.Atleta;
import com.t4t1n.fitgmsport.modulos.Entrenamiento;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.t4t1n.fitgmsport.principal.Principal.cargarEntrenamientos;
import static java.lang.String.valueOf;


/**
 *
 * @author Jaimisky
 */
public class test {

     static private final String FILENAME = "Entrenamientos.txt";
     static private FileReader fileReaderDDBB = null;
     static private BufferedReader bufferedReaderDDBB = null;
    
    public static void main(String[] args) throws IOException {
  /*
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

        System.out.println(cargarEntrenamientos().get(0));*/



        /* This going be large, because to delete i need to read and search i think
        * there are another solution but i use this because i think two mehtod will goin to help me
        * with other things like it say its name */

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del jugador a eliminar: ");
        String name = sc.nextLine();
        deleteFromFile(FILENAME, name);
*/
        try {
            fileReaderDDBB = new FileReader(FILENAME);
            bufferedReaderDDBB = new BufferedReader(fileReaderDDBB);
            String line = "";
            while((line = bufferedReaderDDBB.readLine()) != null){
                String[] parts = line.split(" ");
                System.out.println(valueOf(parts));

            }

        }catch(FileNotFoundException fnfe) {
            System.out.println("No hay ningun archivo");

        }



        
    }


}