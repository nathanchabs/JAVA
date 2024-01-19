package jan14;

import java.util.Scanner;

public class RogersIVR2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rogers Customer Service");

        System.out.println("Press 1 for English, Press 2 for French");
        int mainChoice = scanner.nextInt();

        switch (mainChoice) {
            case 1: // English
                System.out.println("Press 1 for Mobile, 2 for Internet, 3 for TV, 4 to Exit");
                int serviceChoice = scanner.nextInt();

                switch (serviceChoice) {
                    case 1: // Mobile
                    case 2: // Internet
                    case 3: // TV
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
                        break;
                    case 4: // Exit the main menu
                        System.out.println("Exiting main menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                break;
            case 2: // French
                System.out.println("Welcome to French choice");
                // Implement French menu here
                break;
            case 9: // Exit
                System.out.println("Exiting application...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

    }
}
