public class TiposVariaveis {

public static void main (String[] args) {
    //Tipos primitivos em Java

    //Números inteiros
    byte numeroAte127 = 100;
    short numeroAte32767 = 32000;
    int numeroAte2147483647 = 2000000000;
    long numeroBemGrande = 0;

    //Números fracionários
    float numeroDecimalPequeno = (float) 125.46;
    double numeroDecimalGrande = 123545.98349234567;

    //Os outros dois tipos primitivos são boolean e char

    //Linha só para remover aviso de que a variável não foi usada
    System.out.println(numeroAte127 + numeroAte32767 + numeroAte2147483647 + numeroBemGrande + + numeroDecimalPequeno + numeroDecimalGrande);
    }
}