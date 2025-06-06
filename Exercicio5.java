import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            System.out.print("População A: ");
            int a = sc.nextInt();

            System.out.print("Taxa de crescimento A (%): ");
            double taxaA = sc.nextDouble();

            System.out.print("População B: ");
            int b = sc.nextInt();

            System.out.print("Taxa de crescimento B (%): ");
            double taxaB = sc.nextDouble();

            int anos = 0;

            while (a <= b) {
                a += (a * taxaA / 100);
                b += (b * taxaB / 100);
                anos++;
            }

            System.out.println("Levará " + anos + " anos para A ultrapassar B.");

            System.out.print("Deseja repetir? (s/n): ");
            repetir = sc.next().toLowerCase().charAt(0);

        } while (repetir == 's');

        sc.close();
    }
}
