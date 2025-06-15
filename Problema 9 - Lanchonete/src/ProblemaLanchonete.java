import java.util.Locale;
import java.util.Scanner;

public class ProblemaLanchonete {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoProduto, quantidadeComprada;
        double valorPagar;

        System.out.print("Codigo do produto comprado: ");
        codigoProduto = sc.nextInt();

        System.out.print("Quantidade comprada: ");
        quantidadeComprada = sc.nextInt();

        switch (codigoProduto) {
            case 1:
                valorPagar = quantidadeComprada * 5.00;
                break;
            case 2:
                valorPagar = quantidadeComprada * 3.50;
                break;
            case 3:
                valorPagar = quantidadeComprada * 4.80;
                break;
            case 4:
                valorPagar = quantidadeComprada * 8.90;
                break;
            case 5:
                valorPagar = quantidadeComprada * 7.32;
                break;
            default:
                valorPagar = 0.0;
                System.out.println("Codigo de produto inválido.");
                break;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);

        sc.close();
    }
}