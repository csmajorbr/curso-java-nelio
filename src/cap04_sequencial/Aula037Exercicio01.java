package cap04_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula037Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Largura: ");
        double largura = sc.nextDouble();

        System.out.print("Comprimento: ");
        double comprimento = sc.nextDouble();

        System.out.print("Valor do metro quadrado: ");
        double valorMetroQuadrado = sc.nextDouble();

        double area = largura * comprimento;

        double valorFinal = valorMetroQuadrado * area;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", valorFinal);

        sc.close();
    }
}
