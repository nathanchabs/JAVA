package jan14;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        System.out.println("***Welcome to my calculator ***");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        Scanner scanner = new Scanner(System.in);

        int num1, num2, choice;
        System.out.println("Enter first number");
        num1 = scanner.nextInt();
        System.out.println("Enter second number");
        num2 = scanner.nextInt();
        System.out.println("Enter your choice");
    choice = scanner.nextInt();
    if (choice == 1){
        int add = num1+num2;
        System.out.println("Answer : " +add);}
    else if( choice == 2){
        int sub = num1-num2;
        System.out.println("Answer : " +sub);}
    }






    }

