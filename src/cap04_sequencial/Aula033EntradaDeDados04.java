package cap04_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula033EntradaDeDados04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char x;

        System.out.println("Digite o char: ");
        x = sc.next().charAt(0);

        System.out.printf("Você digitou: %c%n", x);

        sc.close();
    }
}
