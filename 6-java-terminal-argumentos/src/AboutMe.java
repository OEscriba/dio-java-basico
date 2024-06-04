import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        //Criando o objeto scanner
        @SuppressWarnings("resource") //Criei utilizando a sugestão da IDE apenas para remover o aviso da linha abaixo
        Scanner scanner = new Scanner(System.in);

        //Solicitando os dados diretamente para o usuário
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        //Exibindo os dados obtidos
        System.out.println("Olá! Me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");
    }
}