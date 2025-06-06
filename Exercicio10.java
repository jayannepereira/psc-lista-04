import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = sc.nextInt();

        int inicio = Math.min(num1, num2) + 1;
        int fim = Math.max(num1, num2);

        System.out.println("Números entre " + num1 + " e " + num2 + ":");
        for (int i = inicio; i < fim; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
