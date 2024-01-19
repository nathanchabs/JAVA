package jan15;

import java.util.Scanner;

public class Compare2 {
    public static void main(String[] args) {
        Scanner rose = new Scanner(System.in);

        System.out.println("Enter number");
        int num1 = rose.nextInt();
        System.out.println("Enter second number");
        int num2 = rose.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = rose.nextInt();
        if (num1 > num2 && num1 > num3)
        {
            System.out.println(num1+ "is the Largest");}
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2+ "is the Largest");}
        else
        {
                System.out.println(num3+ "is the Largest");}
    }
}
