package jan14;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        System.out.println("***Grades ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Mark");
        int mark = scanner.nextInt();
        if (mark >= 90) {
            System.out.println("A");
        } else if (mark >= 80 && mark <= 89) {
            System.out.println("B");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("C");}
        else if (mark >= 60 && mark <= 69) {
            System.out.println("D");}
            else if (mark < 60){
            System.out.println("F");}
        }
        }


