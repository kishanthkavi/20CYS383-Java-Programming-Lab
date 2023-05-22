import java.util.Scanner;

interface Calculator {
    void add(int a, int b);
    void subtract(int a, int b);
    void multiply(int a, int b);
    void divide(int a, int b);
}
class BasicCalculator implements Calculator {
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Sum: " + result);
    }
    public void subtract(int a, int b) {
        int result = a - b;
        System.out.println("Difference: " + result);
    }
    public void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Product: " + result);
    }
    public void divide(int a, int b) {
        if (b != 0) {
            int result = a / b;
            System.out.println("Quotient: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
public class java_interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        Calculator calculator = new BasicCalculator();

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                calculator.add(num1, num2);
                break;
            case 2:
                calculator.subtract(num1, num2);
                break;
            case 3:
                calculator.multiply(num1, num2);
                break;
            case 4:
                calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}