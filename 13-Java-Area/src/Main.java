import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();


        double pi = 3.14159;
        double TRIANGULO = (A * C)/2;
        double CIRCULO = (C * C) * pi;
        double TRAPEZIO = ((A + B) * C) / 2;
        double QUADRADO = B * B;
        double RETANGULO = A * B;


        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);
        scanner.close();
    }
}
