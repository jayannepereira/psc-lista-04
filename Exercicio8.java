import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            soma += sc.nextInt();
        }

        double media = soma / 5.0;
        System.out.println("Soma: " + soma + ", Média: " + media);
        sc.close();
    }
}
