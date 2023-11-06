import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double f_num = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double s_num = scanner.nextDouble();

        double sum = f_num + s_num;
        System.out.printf("The total is: %.2f%n", sum);
    }
}
