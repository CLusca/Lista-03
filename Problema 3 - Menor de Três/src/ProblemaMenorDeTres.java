import java.util.Scanner;

public class ProblemaMenorDeTres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, menor;

        System.out.print("Primeiro valor: ");
        num1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        num2 = sc.nextInt();
        System.out.print("Terceiro valor: ");
        num3 = sc.nextInt();

        menor = num1;

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("MENOR = " + menor);

        sc.close();
    }
}