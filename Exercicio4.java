public class Exercicio4 {
    public static void main(String[] args) {
        int paisA = 80000;
        int paisB = 200000;
        int anos = 0;

        while (paisA <= paisB) {
            paisA *= 1.03;
            paisB *= 1.015;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para a população A ultrapassar B.");
    }
}
