import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, senha;

        do {
            System.out.print("Informe o nome de usuário: ");
            usuario = sc.nextLine();

            System.out.print("Informe a senha: ");
            senha = sc.nextLine();

            if (usuario.equals(senha)) {
                System.out.println("Erro: senha não pode ser igual ao nome de usuário.");
            }
        } while (usuario.equals(senha));

        System.out.println("Cadastro realizado com sucesso.");
        sc.close();
    }
}
