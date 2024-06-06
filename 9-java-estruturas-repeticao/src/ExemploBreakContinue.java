public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int contador = 1; contador <= 5; contador++){
            if(contador == 4){
                break;
            }
            System.out.println(contador);
        }

        System.out.println("Fim da primeira contagem");

        for(int contador = 1; contador <= 5; contador++){
            if(contador == 4){
                continue;
            }
            System.out.println(contador);
        }
    }
}
