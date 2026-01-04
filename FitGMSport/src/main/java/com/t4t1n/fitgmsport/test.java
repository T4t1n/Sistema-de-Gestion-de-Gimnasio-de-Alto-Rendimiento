
package com.t4t1n.fitgmsport;
import com.t4t1n.fitgmsport.modulos.Atleta;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.t4t1n.fitgmsport.principal.Principal.cargarEntrenamientos;


/**
 *
 * @author Jaimisky
 */
public class test {

    final static String FILENAME = "Entrenamientos.txt";
    
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

        readFromFile(FILENAME, true);
        
    }

    // Method to read a file
    private static String[] readFromFile(String file, boolean shouldPrint){
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            int numLines = 0;
            while(br.readLine() != null) {
                numLines++;
            }

            String[] allLines = new String[numLines];

            int itr = 0;
            String name;

            br.close();

            fr = new FileReader(file);
            br = new BufferedReader(fr);

            while ((name = br.readLine()) != null) {
                if (shouldPrint) System.out.print(name);
                allLines[itr++] = name;
            }

            return allLines;
        } catch (IOException error) {
            System.out.println("Error while reading name from " + file + ". ERR: " + error);
            return null;

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }catch (IOException error) {
                System.out.println("Error in closing " + file + ".Err: " + error);
            }
        }
    }




    // Method to delete a data
    private static void deleteFromFile(String file, String name) {
        boolean isWordFound = false;
        String data[] = readFromFile(file, false);
    }
}