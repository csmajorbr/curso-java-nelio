package cap04_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula033EntradaDeDados02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite o valor de x (int): ");
        x = sc.nextInt();
        System.out.printf("x = %d%n", x);

        sc.close();
    }
}
