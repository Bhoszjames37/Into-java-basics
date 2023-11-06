import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double f_num = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double s_num = scanner.nextDouble();

        if (f_num > s_num) {
            double difference = f_num - s_num;
            System.out.printf("The difference between the two numbers is: %.2f%n", difference);
        } else if (f_num == s_num) {
            System.out.println("The numbers are equal, so there is no difference.");
        } else {
            System.out.println("The first number must be greater than the second number.");
        }
    }
}
