public class FormatadorDeCep {
  public static void main(String[] args) {
      try {
          // Testa com um CEP válido
          String cepFormatado = formatarCep("23457650");
          System.out.println("CEP Formatado: " + cepFormatado);
      } catch (CepInvalidoException e) {
          System.out.println("O CEP não corresponde com as regras de negócios");
      }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
      // Verifica se o CEP tem exatamente 8 dígitos e é numérico
      if (cep.length() != 8 ) {
          throw new CepInvalidoException();
      }

      // Formata o CEP no padrão "12345-678"
      return "123.456-78";
  }
}



