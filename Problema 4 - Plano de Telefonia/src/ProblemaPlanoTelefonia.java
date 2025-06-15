import java.util.Locale;
import java.util.Scanner;

public class ProblemaPlanoTelefonia {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutosConsumidos;
        double valorPagar;

        System.out.print("Digite a quantidade de minutos: ");
        minutosConsumidos = sc.nextInt();

        valorPagar = 50.00;

        if (minutosConsumidos > 100) {
            int minutosExcedentes = minutosConsumidos - 100;
            valorPagar += minutosExcedentes * 2.00;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);

        sc.close();
    }
}