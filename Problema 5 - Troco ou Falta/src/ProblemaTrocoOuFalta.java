import java.util.Locale;
import java.util.Scanner;

public class ProblemaTrocoOuFalta {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUnitario, dinheiroRecebido, valorTotal, troco;
        int quantidadeComprada;

        System.out.print("Preço unitário do produto: ");
        precoUnitario = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantidadeComprada = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        dinheiroRecebido = sc.nextDouble();

        valorTotal = precoUnitario * quantidadeComprada;

        if (dinheiroRecebido >= valorTotal) {
            troco = dinheiroRecebido - valorTotal;
            System.out.printf("TROCO = %.2f%n", troco);
        } else {
            double dinheiroFalta = valorTotal - dinheiroRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", dinheiroFalta);
        }

        sc.close();
    }
}