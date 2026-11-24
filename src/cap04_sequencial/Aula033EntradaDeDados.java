package cap04_sequencial;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Aula033EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;

        System.out.println("Digite o valor de x (String): ");
        x = sc.next();

        System.out.println("x = " + x);
    }
}
