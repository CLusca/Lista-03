import java.util.Locale;
import java.util.Scanner;

public class ProblemaLancamentoDardo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double distancia1, distancia2, distancia3, maiorDistancia;

        System.out.println("Digite as tres distancias:");
        distancia1 = sc.nextDouble();
        distancia2 = sc.nextDouble();
        distancia3 = sc.nextDouble();

        maiorDistancia = distancia1;

        if (distancia2 > maiorDistancia) {
            maiorDistancia = distancia2;
        }

        if (distancia3 > maiorDistancia) {
            maiorDistancia = distancia3;
        }

        System.out.printf("MAIOR DISTANCIA = %.2f%n", maiorDistancia);

        sc.close();
    }
}