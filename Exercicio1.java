import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Informe uma nota entre 0 e 10: ");
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota aceita: " + nota);
        sc.close();
    }
}
