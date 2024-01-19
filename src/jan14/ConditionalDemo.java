package jan14;

import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args){
        System.out.println ("***Welcome to my voting machine ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        if(age <13){
            System.out.println("infant");}
        else if(age >13 && age <19){
            System.out.println("Teenager");}
        else if(age >19 && age <60){
            System.out.println("Adult");}
        else if(age >60 && age <100){
            System.out.println("Senior Citizen");
                       }
        }


            }



