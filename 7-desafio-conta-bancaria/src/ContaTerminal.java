import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Criação do objeto scanner
        @SuppressWarnings("resource") //Sugestão da IDE para remover o aviso da linha abaixo
        Scanner scanner = new Scanner(System.in);

        //Solicitando as informações para o usuário
        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite a agência do banco: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
     
        //Exibindo os dados obtidos
        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
