package ejercicios_temas7_8_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FuncionReverse {
    public static String reverse(String texto) {

        List<Character> list = new ArrayList<Character>();

        for (char c: texto.toCharArray()) {
            list.add(c);
        }

        Collections.reverse(list);

        StringBuilder builder = new StringBuilder(list.size());
        for (Character c: list) {
            builder.append(c);
        }

        return builder.toString();

    }


}

