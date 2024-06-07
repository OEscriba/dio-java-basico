import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.printf("Valor depositado com sucesso. Saldo atual: %.1f", saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    if (saldo > saque){
                        saldo = saldo - saque;
                        System.out.printf("Saque realizado com sucesso. Saldo atual: %.1f", saldo);
                        break;
                    }
                    else{
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}