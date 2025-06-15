import java.util.Locale;
import java.util.Scanner;

public class ProblemaAumentoSalarial {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioAtual, novoSalario, aumento;
        int porcentagemAumento;

        System.out.print("Digite o salario da pessoa: ");
        salarioAtual = sc.nextDouble();

        if (salarioAtual <= 1000.00) {
            porcentagemAumento = 20;
            aumento = salarioAtual * 0.20;
        } else if (salarioAtual <= 3000.00) {
            porcentagemAumento = 15;
            aumento = salarioAtual * 0.15;
        } else if (salarioAtual <= 8000.00) {
            porcentagemAumento = 10;
            aumento = salarioAtual * 0.10;
        } else {
            porcentagemAumento = 5;
            aumento = salarioAtual * 0.05;
        }

        novoSalario = salarioAtual + aumento;

        System.out.printf("Novo salario R$ %.2f%n", novoSalario);
        System.out.printf("Aumento R$ %.2f%n", aumento);
        System.out.printf("Porcentagem = %d%%%n", porcentagemAumento);

        sc.close();
    }
}