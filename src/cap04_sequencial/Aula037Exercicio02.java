package cap04_sequencial;

import java.util.Scanner;

public class Aula037Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma= x + y;
        System.out.printf("SOMA = %d%n", soma);

        sc.close();
    }
}
