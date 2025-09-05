
package com.t4t1n.fitgmsport;
import com.t4t1n.fitgmsport.modulos.Entrenamiento;
import com.t4t1n.fitgmsport.recursos.Categoria;
import com.t4t1n.fitgmsport.recursos.GuardarEnArchivo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Jaimisky
 */
public class test {
    
    public static void main(String[] args) throws IOException {
        
//        String input = "Trabajo físico intensivo";
//        String withoutAccent = StringUtils.stripAccents(input.toUpperCase().replaceAll("\\s", ""));
//        System.out.println(withoutAccent);
//        
//        
//       Random r = new Random();
//       String randomNumber = String.format("%04d", r.nextInt(1001));
//       String randomNumber1 = String.format("%04d", r.nextInt(1001));
//       String randomNumber2 = String.format("%04d", r.nextInt(1001));
//        System.out.println(randomNumber);
//                System.out.println(randomNumber1);
//                        System.out.println(randomNumber2);
//                        
//        String tex = "Competitivo";                
//        Categoria text = Categoria.valueOf(tex.toUpperCase());
//        Entrenamiento en1 = new Entrenamiento("Trabajo intensio fisico", text);
//        
//        System.out.println(en1);
        
        
        
        Scanner sc = new Scanner(System.in);
//        String texto;
//        String categoria;
//        
//        
//        System.out.println("Ingrese la categoria: ");
//        categoria = sc.nextLine();
//        System.out.println("Ingrese el tipo de entrenamiento: ");
//        texto = sc.nextLine();
//        
//        
//        Path  path = Path.of("Entrenamientos.txt");
//        int pos = -1;
//        try {
//            List<String> lista = Files.readAllLines(path);
//            String cad = "";
//            String im = "";
//            for (int i = 0; i < lista.size(); i++) {
//                pos = lista.get(i).indexOf(texto);
//                if(pos != -1) {
//                    cad += "Se encontró la palabra en la linea " + 
//                            i +" posición " + pos + "\n";
//                    im =  lista.get(i+1);  
//                }
//            }
//           
//            if (!"Categoria: Recreativo]".equalsIgnoreCase(im) && categoria.equals("Recreativo")){
//               System.out.println("No se puede debe debes elegir uno recreativo");
//            }else {
//                System.out.println("lo lograste");
//            }
//            System.out.println(im);
//            System.out.println(cad);
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        
        
        
        
        
        
        
        
        
        
//        
//        System.out.println("Escribe algo importante");
//        String text = sc.nextLine();
//        
//        try{
//            BufferedWriter wf = new BufferedWriter(new FileWriter("notes.txt", true));
//            wf.write("Notas de alguien que maneja sus problemas");
//            wf.append(text);
//            wf.close();
//        }catch (Exception e){
//            System.out.println(e);
//        }
        
//        try {
//            File file = new File("notes.txt");
//            BufferedReader rf = new BufferedReader(new FileReader(file));
//            System.out.println(rf.readLine());
//            System.out.println(file.getAbsolutePath());
//            
//            rf.close();
//        }catch(Exception e) {
//            System.out.println(e);
//        }



//        String tex = "Competitivo";                
//        Categoria text2 = Categoria.valueOf(tex.toUpperCase());
//        Entrenamiento en1 = new Entrenamiento("Trabajo intensio fisico", text2);
//        Entrenamiento en2 = new Entrenamiento("Trabajo demencial", text2);
//        List<Entrenamiento> Entrenamiento = List.of(en1,en2);
//        List<String> list;
//        String entre = en1.toString();
//        list = List.of(en1.toString(), en2.toString());
//        Path rutaArchivo = Paths.get("notes.txt");
//        Files.write(rutaArchivo, list);
//        String contenido = Files.readString(rutaArchivo);
//        System.out.println(contenido);
        
//        List<Entrenamiento> entrenamientos1;
//        List<String> ListaEn;
//        File file = new File("Hola.txt");
//        int contador = 0;
//        while(contador < 4) {
//            String tex3 = "Competitivo";                
//            Categoria text4 = Categoria.valueOf(tex3.toUpperCase());
//            Entrenamiento en = new Entrenamiento("Trabajo intensio fisico", text4);
//            entrenamientos1 = List.of(en);
//            ListaEn = List.of(en.toString());
//            Path rutaHola = Paths.get("Hola.txt");
//            Files.write(rutaHola, ListaEn);
//            String contenido1 = Files.readString(rutaHola);
//            System.out.println(contenido1);
//            contador++;
//        }       
//        String seguir;
//        String descEntrenamiento;
//        String categoriaEntre;
//        List<Entrenamiento> listaEntrenamientos = new ArrayList();
//        List<String> listaEntrenamientosTexto = new ArrayList();
//        Path rutaEntrenamientos = Paths.get("Entrenamientos.txt");
//        
//        do {
//            System.out.println("Escribe la descripcion de el entrenamiento: ");
//            descEntrenamiento = sc.nextLine();
//            System.out.println("Escribe la categoria a la que pertenecera este entrenamiento");
//            categoriaEntre = sc.nextLine();
//            Categoria ce = Categoria.valueOf(categoriaEntre.toUpperCase());
//            listaEntrenamientos.add(new Entrenamiento(descEntrenamiento, ce));
//            listaEntrenamientosTexto.addLast(listaEntrenamientos.toString());
//            Files.write(rutaEntrenamientos,listaEntrenamientosTexto);
//            System.out.println("Desea seguir?");
//            seguir = sc.nextLine();       
//        }while(seguir.equalsIgnoreCase("S"));
//        String contenidoEn = Files.readString(rutaEntrenamientos);
//        System.out.println(contenidoEn);
        
//        List<Entrenamiento> letras = new ArrayList();
//        List<String> letras2 = new ArrayList();
//        
//        String tex = "Competitivo";                
//        Categoria text = Categoria.valueOf(tex.toUpperCase());
//        int contador = 0;
//        
////        while(contador.contains("Y")) {
////            letras.add(new Entrenamiento("Trabajo", text));
////            System.out.println("You need to go!");
////           contador = sc.nextLine();
////        }
//        Path rutaEntrenamientos = Paths.get("Entrenamientos.txt");
//        String ultimo;
//        
////        do {
////            letras.add(new Entrenamiento("Trabajo", text));
////            
////            letras2.addLast(letras.toString());
////            ultimo = letras2.getLast();
////            Files.writeString(rutaEntrenamientos, ultimo);
////            contador++;
////        }while(contador != 5);
//        
        
        String entrenamiento;
        String categoria;
        String seguir = "Y";
        List<Entrenamiento> en = new ArrayList<>();
        List<String> entxt = new ArrayList<>();
        String last;
        
        
        //while(seguir.contains("Y")){
            System.out.println("Entrenamiento: ");
            entrenamiento = sc.nextLine();
            System.out.println("Categoria: ");
            categoria = sc.nextLine();
            Categoria categoriaValidation = Categoria.valueOf(categoria.toUpperCase());
            en.add(new Entrenamiento(entrenamiento, categoriaValidation));
            entxt.add(en.toString());
            last = entxt.getLast();
            GuardarEnArchivo.entrenamientos(last);
            //Path rutaEntrenamientos1 = Paths.get("Entrenamientos1.txt");
            //Files.createFile(rutaEntrenamientos1);
            //Files.writeString(rutaEntrenamientos1, last, StandardOpenOption.APPEND);
            //System.out.println("Need to insert more?");
            //seguir = sc.nextLine();
        //}
        


        
    }
}