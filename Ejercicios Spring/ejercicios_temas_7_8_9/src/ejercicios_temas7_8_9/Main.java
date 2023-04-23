package ejercicios_temas7_8_9;

import java.util.*;
import static ejercicios_temas7_8_9.ArithmeticException.DividePorCero;
import static ejercicios_temas7_8_9.FuncionReverse.reverse;

public class Main {

    public static void main(String[] args) throws ArithmeticException{

        //Funcion reverse.

        System.out.println("EJERCICIO REVERSE:");

        String text = "Hola mundo";
        text = reverse(text);
        System.out.println(text);
        System.out.println();

        //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

        System.out.println("EJERCICIO 1:");

        String arrayUni[] = {"Antonio","Maria","Miguel","Ana"};

        for(String array : arrayUni){
            System.out.println(array);
        }
        System.out.println();

        //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

        System.out.println("EJERCICIO 2:");
        int arrayBi[][] = {{6,7},{3,9},{2,4}};

        for(int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.println("La posicion es: " + i + "|" + j + " y el valor es: " + arrayBi[i][j]);
            }
        }
        System.out.println();

        //3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

        System.out.println("EJERCICIO 3:");
        Vector<String> vector = new Vector();
        vector.add("Rojo");
        vector.add("Azul");
        vector.add("Verde");
        vector.add("Amarillo");
        vector.add("Negro");

        vector.remove("Verde");
        vector.remove("Amarillo");
        System.out.println(vector);
        System.out.println();

        //4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        System.out.println("EJERCICIO 4:");
        System.out.println("El problema de utilizar un Vector con la capacidad por defecto es que su capacidad inicial seria de 10 elementos\n" +
                            "y al sobrepasar esa capacidad se duplicaria. Si tuviesemos que añadir 1000 elementos, cada vez que se tuviera que duplicar \n" +
                            "la capacidad, mientras se produce la copia, tendriamos 2 arrays que duplicarian en memoria el consumo");
        System.out.println();

        //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        System.out.println("EJERCICIO 5:");
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Invierno");
        arrayList.add("Primavera");
        arrayList.add("Verano");
        arrayList.add("Otoño");

        LinkedList<String> linked = new LinkedList<String> (arrayList);

        System.out.println("Esto es un arrayList:");
        for(String list : arrayList){
            System.out.println(list);
        }
        System.out.println();

        System.out.println("Esto es un LinkedList:");
        for(String link : linked){
            System.out.println(link);
        }
        System.out.println();

        //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último,
        //    vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        System.out.println("EJERCICIO 6:");

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=1;i < 11;i++){
            numbers.add(i);

        }
        System.out.println("Esta es la lista completa: " + numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Esta es la lista con los numeros pares borrados: " + numbers);
        System.out.println();

        //7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main",
        // por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

        System.out.println("EJERCICIO 7:");
        System.out.println("Si divides entre 0 se producira una excepcion");
        try{
            DividePorCero();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally{
            System.out.println("Demo de código");
        }
        System.out.println();

        //8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado
        // en el parámetro "fileIn" al fichero dado en "fileOut".

        System.out.println("EJERCICIO 8:");

        CopyFile fichero1 = new CopyFile("fichero_prueba.txt", "fichero_copiado.txt");
        System.out.println();


        //9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

        System.out.println("EJERCICIO 9:");

        MiPrograma.EdadMayor calc = new MiPrograma.EdadMayor();








    }
}
