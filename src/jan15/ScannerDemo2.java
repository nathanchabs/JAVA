package jan15;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String args[]){
        Scanner Rose = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = Rose.nextInt();
        System.out.println("Enter second number: ");
        int num2 = Rose.nextInt();
        int prod = num1*num2;
        System.out.println(prod);
    }
}
