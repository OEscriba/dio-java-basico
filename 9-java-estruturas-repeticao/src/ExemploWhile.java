import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0){
            double valorDoce = valorAleatorio();
            /*
            if (valorDoce > mesada){
                valorDoce = mesada;
            }
            */
            System.out.println("O valor do doce escolhido é R$" + valorDoce + " e ele foi adicionado ao carrinho.");
            mesada = mesada - valorDoce;
        }

        System.out.println("O valor restante da mesada é: R$" + mesada);
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
