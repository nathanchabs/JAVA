package jan15;

import java.util.Scanner;

public class Else {
    public static void main(String []args ){
        Scanner rose = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = rose.nextInt();
        if(age < 13) {
            System.out.println("Infant");
        }else if(age > 13 && age< 19) {
            System.out.println("teenager");
        }else if(age >= 19 && age <= 60){
            System.out.println("Adult");}
        else if (age > 60 && age <100) {
            System.out.println("Senior Citizen");
        }else{
            System.out.println("Not Human");

        }




        }
    }

