package ejercicios_temas7_8_9;

import java.io.*;
import java.util.Scanner;

public class CopyFile{

    public CopyFile(String fileIn, String fileOut){

        String text = "";
        try{
            Scanner textIn = new Scanner(System.in);
            System.out.println("Introduce el texto que quieres guardar en el fichero");

            PrintStream textFile = new PrintStream("fichero_prueba.txt");
            text = textIn.nextLine();
            textFile.write(text.getBytes());

            InputStream file_In = new FileInputStream(fileIn);
            byte[] data = file_In.readAllBytes();
            System.out.println("El texto guardado es:");
            for(byte dato : data){
                System.out.print((char)dato);
            }

            OutputStream file_Out = new FileOutputStream(fileOut);
            file_Out.write(data);

            file_In.close();
            file_Out.close();
            textFile.close();

            System.out.println();
            System.out.println("Enhorabuena, has creado y copiado el fichero!!");

        }catch (IOException e) {
            System.out.println("Error, no se ha podido realizar la copia");
        }
        System.out.println();

    }
}
