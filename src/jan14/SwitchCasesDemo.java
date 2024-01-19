package jan14;

import java.util.Scanner;

public class SwitchCasesDemo {
    public static void main(String[] args) {
        System.out.println("***Welcome to my calculator ***");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int choice;

        System.out.println("Enter first number");
        num1 = scanner.nextInt();
        System.out.println("Enter second number");
        num2 = scanner.nextInt();
        System.out.println("Enter your choice");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                int add = num1 + num2;
                System.out.println("Answer : " + add);
                break;
            case 2:
                int sub = num1 - num2;
                System.out.println("Answer : " + sub);
                break;
            case 3:
                int prod = num1 * num2;
                System.out.println("Answer : " + prod);
                break;
            case 4:
                int div = num1 / num2;
                System.out.println("Answer : " + div);
                break;
            case 5:
                int mod = num1 % num2;
                System.out.println("Answer : " + mod);
                break;
            default:
                System.out.println("Invalid input");
        }


    }
}