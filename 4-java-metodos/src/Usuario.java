public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("O canal atual é: " + smartTv.canal);
        System.out.println("O volume está em: " + smartTv.volume);
        
        smartTv.mudarCanal(27);

        smartTv.ligar();
        System.out.println("Novo status - A TV está ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status - A TV está ligada? " + smartTv.ligada);
    }
}
