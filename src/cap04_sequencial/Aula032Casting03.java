package cap04_sequencial;

import java.util.Locale;

public class Aula032Casting03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a / b;     // casting

        System.out.println(resultado);
    }
}
