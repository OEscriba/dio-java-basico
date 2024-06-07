import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        //Inicia o scanner
        Scanner input = new Scanner(System.in);

        //Obtém dados via terminal
        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1 = input.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = input.nextInt();

        try{
            contar(parametro1, parametro2);

        }
        catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

        //Encerra o scanner
        input.close();
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        }
        
        int contador = parametro2 - parametro1;
        for(int indice = 1; indice <= contador; indice++){
            System.out.println("Imprimindo número " + indice);
        }
    }
}