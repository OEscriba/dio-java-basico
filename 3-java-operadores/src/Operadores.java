public class Operadores {
    public static void main(String[] args) throws Exception {
        boolean valor1 = true;
        boolean valor2 = false;
        boolean valor3 = true;

        if ((valor1 && valor2) && valor3) {
            System.out.println("As condições são verdadeiras");
        }
        else {
            System.out.println("As condições são falsas");
        }
        String resultado = valor1 && valor2 ? "Condição verdadeira" : "Condição falsa";

        System.out.println(resultado);
    }
    
}
