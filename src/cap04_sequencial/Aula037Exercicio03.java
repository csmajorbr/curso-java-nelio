package cap04_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula037Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double PI = 3.14159;
        double raio = sc.nextDouble();
        double area = PI * Math.pow(raio, 2.0);

        System.out.printf("A = %.4f%n", area);

        sc.close();
    }
}
