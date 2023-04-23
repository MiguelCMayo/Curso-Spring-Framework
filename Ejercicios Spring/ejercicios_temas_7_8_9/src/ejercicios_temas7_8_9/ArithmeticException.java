package ejercicios_temas7_8_9;

import java.util.Scanner;

public class ArithmeticException extends Exception {
    private static final long serialVersionUID = 1L;

    public ArithmeticException(String errorMessage) {
        super(errorMessage);
    }


    static void DividePorCero() throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if(number1 == 0 || number2 == 0){
            throw new ArithmeticException("No puede dividirse entre 0");
        }

        int result = number1 / number2;
        System.out.println("El resultado es: " + result);


    }


}