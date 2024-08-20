import java.util.Random;

public class Dwhile {
    public static void main(String[] args) {
        System.out.println("discando...");
        do{
            //executando repetidas vezes até atenderem
            System.out.println("Telefone tocando");

        }while (tocando());

        System.out.println("Alo !!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? "+ atendeu);

        //negando o ato de continuar tocando
        return ! atendeu;



    }
}
