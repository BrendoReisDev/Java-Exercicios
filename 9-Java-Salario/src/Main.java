import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFuncionario = scanner.nextInt();
        int horasTrabalhas = scanner.nextInt();
        double salario = scanner.nextDouble();
        System.out.println("NUMERO = "+numFuncionario);
        salario = horasTrabalhas * salario;
        System.out.printf("SALARIO = U$ %.2f\n" , salario);

    }
}