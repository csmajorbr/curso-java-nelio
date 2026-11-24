package cap04_sequencial;

import java.util.Locale;

public class Aula031SaidaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int y = 32;
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("Bom dia!");

        System.out.println("RESULTADO = " + x + " METROS");

        System.out.printf("RESULTADO = %.2f metros%n", x);

        System.out.printf("%s tem %d anos e ganha R$ %.1f\n", nome, idade, renda);

    }
}
