import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        double R = scanner.nextDouble();
        double volume = (4 / 3.0) * pi * (R * R * R);
        System.out.printf("VOLUME = %.3f\n", volume);
        scanner.close();
    }
}
