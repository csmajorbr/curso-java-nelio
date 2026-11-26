package cap05_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula046SwitchCase02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia = "";

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                System.out.println("ERRO: Digite um valor entre 1 e 7.");
                break;
        }

        System.out.printf("Dia da semana: %s%n", dia);

        sc.close();
    }
}
