package jan15;
import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
Scanner rose = new Scanner (System.in);
double num1, num2, answer;
System.out.println("Enter first num :  ");
num1 = rose.nextDouble();
System.out.println("Enter second num: ");
num2 = rose.nextDouble();
System.out.println("Enter the answer : ");
answer = num1 + num2;
System.out.println(answer);
    }
}
