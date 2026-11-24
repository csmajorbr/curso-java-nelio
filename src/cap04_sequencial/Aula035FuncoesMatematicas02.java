package cap04_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula035FuncoesMatematicas02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.println("Digite os valores de a, b e c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2.0) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.printf("delta = %.2f%n", delta);
        System.out.printf("x1 = %.2f%n", x1);
        System.out.printf("x2 = %.2f%n", x2);

        sc.close();
    }
}
