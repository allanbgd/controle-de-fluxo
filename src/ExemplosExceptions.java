import java.text.NumberFormat;
import java.text.ParseException;

public class ExemplosExceptions {
    public static void main(String[] args) {
        try {
            NumberFormat numberFormat = NumberFormat.getInstance();
            // O método parse pode lançar ParseException se a string não puder ser analisada
            Number valor = numberFormat.parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            // Corrigido o nome do método para printStackTrace
            e.printStackTrace();
        }
    }
}
