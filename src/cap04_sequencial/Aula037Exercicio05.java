package cap04_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula037Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int empID = sc.nextInt();
        double horas = sc.nextDouble();
        double salarioHora = sc.nextDouble();
        double salarioFinal = horas * salarioHora;

        System.out.printf("NUMBER = %d%n", empID);
        System.out.printf("SALARY = U$ %.2f%n", salarioFinal);

        sc.close();
    }
}
