import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner entrada = new Scanner(System.in);
        System.out.print("digite um número inteiro: ");
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.print( "o número " + numero + " é par.");
            }else{
                System.out.print("o número " + numero + " é impar.");
            }
        entrada.close();
    }
}
