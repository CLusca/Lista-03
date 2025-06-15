import java.util.Locale;
import java.util.Scanner;

public class ProblemaConversorTemperatura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char escala;
        double temperatura, temperaturaConvertida;

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        escala = sc.next().charAt(0);

        escala = Character.toUpperCase(escala);

        if (escala == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = sc.nextDouble();
            temperaturaConvertida = (5.0 / 9.0) * (temperatura - 32.0);
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", temperaturaConvertida);
        } else if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = sc.nextDouble();
            temperaturaConvertida = (temperatura * 9.0 / 5.0) + 32.0;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", temperaturaConvertida);
        } else {
            System.out.println("Escala inválida. Por favor, digite 'C' ou 'F'.");
        }

        sc.close();
    }
}