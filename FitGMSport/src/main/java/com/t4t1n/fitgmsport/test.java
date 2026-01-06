
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
    private static void readFromFile(String file, boolean shouldPrint){

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {


            List<String> lista = new ArrayList<>();


            String name;
            String code = "Codigo: GYM0320";



            while ((name = br.readLine()) != null) {
                    if (name.equalsIgnoreCase(code)) System.out.println(name);
                

            }

            //return ;
        } catch (IOException error) {
            System.out.println("Error while reading name from " + file + ". ERR: " + error);
            //return null;



        }
    }




    // Method to delete a data
    private static void deleteFromFile(String file, String name) {
        boolean isWordFound = false;
        //String data[] = readFromFile(file, false);
    }
}