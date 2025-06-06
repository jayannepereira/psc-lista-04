import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.print("Nome (mais de 3 letras): ");
            nome = sc.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.print("Idade (0 a 150): ");
            idade = sc.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Salário (maior que 0): ");
            salario = sc.nextDouble();
        } while (salario <= 0);

        sc.nextLine(); // consumir quebra de linha

        do {
            System.out.print("Sexo (f/m): ");
            sexo = sc.nextLine().toLowerCase();
        } while (!sexo.equals("f") && !sexo.equals("m"));

        do {
            System.out.print("Estado civil (s/c/v/d): ");
            estadoCivil = sc.nextLine().toLowerCase();
        } while (!estadoCivil.matches("[scvd]"));

        System.out.println("Dados validados com sucesso.");
        sc.close();
    }
}
