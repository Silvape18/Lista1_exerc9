import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double fah;
        double cel;

        System.out.print("Por Favor, Digite um valor Fahrenheit: ");
        fah = entrada.nextDouble();

        cel = 5 * ((fah - 32)/9);
        System.out.print("O valor em Celsius é: " + cel);
        

    }
}
