public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765025");
        } catch (CepInvalidoException e) {
            System.out.println("CEP inválido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //Simulando formatação de CEP
          return "23.765-064";
    }
}
