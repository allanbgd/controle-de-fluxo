
import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AboutMe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //ele vê a execução do bloco
        try {
            System.out.println("Digite seu nome");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura ");
            double altura = scanner.nextDouble();

            // Output formatted information
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");

        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");

        } // como normalmente aparecerá um erro inputMismarch então ele irá executar o sout descrito
    }
}
