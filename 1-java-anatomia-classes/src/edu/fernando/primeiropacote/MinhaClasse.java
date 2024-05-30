package edu.fernando.primeiropacote;
public class MinhaClasse {

public static void main(String[] args) {
    //System.out.print("Olá, mundo!");

    //Declarando variáveis
    //Tipo nomeDaVariavel = valor (opcional em alguns casos)

    //String testeValorNaoAtribuido;
    //int anoFabricacao = 2005;
    //boolean verdadeira = true;

    //Variáveis para teste do método
    String primeiroNome = "Fernando";
    String sobrenome = "Thibes";
    String nomeCompleto = juntarNomeSobrenome(primeiroNome, sobrenome);

    System.out.println(nomeCompleto);
}

public static String juntarNomeSobrenome (String primeiroNome, String segundoNome){
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}

}
