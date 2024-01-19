package jan15;

import java.util.Scanner;

public class Compare {
    public static void main (String [] args) {
        Scanner rose = new Scanner(System.in);
        int num1, num2, num3, largest;

        System.out.println("Enter number");
        num1 = rose.nextInt();
        System.out.println("Enter second number");
        num2 = rose.nextInt();
        System.out.println("Enter 3rd number");
        num3 = rose.nextInt();
        if (num1 > num2 && num1 > num3)
            largest = num1;

     else if(num2 > num1 && num2 > num3)
         largest = num2;
     else
         largest =  num3;
     System.out.printf("Largest among %d %d and %d is%d" ,num1,num2,num3,largest );


    }
}
