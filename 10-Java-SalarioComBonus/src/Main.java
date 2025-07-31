import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double salarioBonus = scanner.nextDouble();
        salarioFixo = (15.0 / 100) * salarioBonus + salarioFixo;
        System.out.println("NOME: "+nome);
        System.out.printf("TOTAL = R$ %.2f\n", salarioFixo);

    }
}