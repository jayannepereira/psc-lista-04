import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int n = sc.nextInt();
            if (n > maior) maior = n;
        }

        System.out.println("Maior número: " + maior);
        sc.close();
    }
}
