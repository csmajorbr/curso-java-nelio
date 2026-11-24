package cap05_condicional;

import java.util.Scanner;

public class Aula044Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int total = 0;

        if (horaFinal > horaInicial) {
            total = horaFinal - horaInicial;
        } else {
            total = (24 - horaInicial) + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", total);

        sc.close();
    }
}
