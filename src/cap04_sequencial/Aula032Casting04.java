package cap04_sequencial;

import java.util.Locale;

public class Aula032Casting04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double a;
        int b;

        a = 5.0;
        b = (int) a;

        System.out.println(b);
    }
}
