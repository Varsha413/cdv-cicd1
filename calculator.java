import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int multiplication = a*b;

        System.out.println("Sum is = " + sum,"the multiplication is = " + multiplication);
    }
}
