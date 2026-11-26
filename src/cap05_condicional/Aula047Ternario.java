package cap05_condicional;

public class Aula047Ternario {
    public static void main(String[] args) {

        double preco = 34.5;
        double desconto;

//        if (preco < 20.0) {
//            desconto = preco * 0.1;
//        } else {
//            desconto = preco * 0.05;
//        }

        // A mesma expressão utilizando ternário:
        desconto = (preco < 20.0) ? preco * 0.01 : preco * .05;

        System.out.println("Desconto: " + desconto);
    }
}
