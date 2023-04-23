package ejercicios_temas7_8_9;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MiPrograma {
    public static class EdadMayor {
        public EdadMayor() {

            int age = 0;
            String name = " ";
            HashMap<Integer,String> data = new HashMap<>();
            int arrayAge[]= new int[3];
            String arrayName[]= new String[3];
            int older = 0;

            System.out.println("Este programa te pide la edad y el nombre de tres usuarios, los guarda en un mapa\n" +
                                "y a continuacion, mediante un array, te dice que usuario tiene mas edad.\n");
            try{

                Scanner ageIn1 = new Scanner(System.in);
                System.out.println("Introduce la edad del primer usuario");
                age = ageIn1.nextInt();
                Scanner nameIn1 = new Scanner(System.in);
                System.out.println("Introduce el nombre del primer usuario");
                name = nameIn1.next();
                data.put(age, name);
                arrayAge[0]= age;
                arrayName[0]= name;

                Scanner ageIn2 = new Scanner(System.in);
                System.out.println("Introduce la edad del segundo usuario");
                age = ageIn2.nextInt();
                Scanner nameIn2 = new Scanner(System.in);
                System.out.println("Introduce el nombre del segundo usuario");
                name = nameIn2.next();
                data.put(age, name);
                arrayAge[1]= age;
                arrayName[1]= name;

                Scanner ageIn3 = new Scanner(System.in);
                System.out.println("Introduce la edad del tercer usuario");
                age = ageIn3.nextInt();
                Scanner nameIn3 = new Scanner(System.in);
                System.out.println("Introduce el nombre del tercer usuario");
                name = nameIn3.next();
                data.put(age, name);
                arrayAge[2]= age;
                arrayName[2]= name;

            }catch (InputMismatchException e){
                System.out.println("Datos introducidos incorrectos");
            }

            System.out.println("Los usuarios guardados en el mapa son:\n" + data + "\n");

            for(int i=0; i<arrayAge.length && i<arrayName.length; i++){
                if(arrayAge[i]>older){
                    older = arrayAge[i];
                }
            }

            for(HashMap.Entry <Integer,String> pair : data.entrySet()){
                if(older == pair.getKey()){
                    System.out.println("El usuario de mayor edad tiene " + pair.getKey() + " años y se llama " + pair.getValue());
                }
            }
        }
    }
}
