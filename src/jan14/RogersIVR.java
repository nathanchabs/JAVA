package jan14;

import java.util.Scanner;

public class RogersIVR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rogers Customer Service");

        System.out.println("\nPress 1 for English, Press 2 for French, Press 9 to Exit");
        int mainChoice = scanner.nextInt();

        // Handling English menu
        if (mainChoice == 1) {
            System.out.println("Press 1 for Mobile, 2 for Internet, 3 for TV, 4 to Exit");
            int serviceChoice = scanner.nextInt();

            if (serviceChoice >= 1 && serviceChoice <= 3) {
                System.out.println("Press 1 for Tech support, 2 for Billing, 3 to Exit");
                int subChoice = scanner.nextInt();
                switch (subChoice) {
                    case 1:
                        System.out.println("Connecting to Tech Support...");
                        break;
                    case 2:
                        System.out.println("Connecting to Billing...");
                        break;
                    case 3:
                        System.out.println("Exiting service menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
            if (serviceChoice == 4) {
                System.out.println("Exiting main menu...");
            }
            if (serviceChoice < 1 || serviceChoice > 4) {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        // Handling French menu
        if (mainChoice == 2) {
            System.out.println("Welcome to French choice");
            // Implement French menu here
        }

        // Handling Exit
        if (mainChoice == 9) {
            System.out.println("Exiting application...");
        }

        // Handling Invalid Main Choice
        if (mainChoice != 1 && mainChoice != 2 && mainChoice != 9) {
            System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}

