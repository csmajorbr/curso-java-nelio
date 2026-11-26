package cap05_condicional;

import java.util.Scanner;

public class Aula046SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor entre 1 e 7: ");
        int diaDaSemana = sc.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Dia da semana: domingo");
                break;
            case 2:
                System.out.println("Dia da semana: segunda");
                break;
            case 3:
                System.out.println("Dia da semana: terça");
                break;
            case 4:
                System.out.println("Dia da semana: quarta");
                break;
            case 5:
                System.out.println("Dia da semana: quinta");
                break;
            case 6:
                System.out.println("Dia da semana: sexta");
                break;
            case 7:
                System.out.println("Dia da semana: sábado");
                break;
            default:
                System.out.println("ERRO: Valor inválido! Digite um valor entre 1 e 7.");
                break;
        }

        sc.close();
    }
}
