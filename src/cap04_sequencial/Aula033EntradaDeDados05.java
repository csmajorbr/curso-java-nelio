package cap04_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula033EntradaDeDados05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.printf("String: %s\nint: %d\ndouble: %.2f\n", x, y, z);

        sc.close();
    }
}
