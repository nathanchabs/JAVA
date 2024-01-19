package jan14;

import java.util.Scanner;

public class AssignmentRogersIVR {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Rogers Customer Service");
        while (true) {
            System.out.println("Press 1 for English, Press 2 for French, Press 9 to Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    englishMenu();
                    break;
                case 2:
                    System.out.println("Welcome to French choice");
                    // Implement French menu here
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void englishMenu() {
        System.out.println("Press 1 for Mobile, 2 for Internet, 3 for TV, 4 to Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                serviceMenu("Mobile");
                break;
            case 2:
                serviceMenu("Internet");
                break;
            case 3:
                serviceMenu("TV");
                break;
            case 4:
                return; // Exit the English menu
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void serviceMenu(String serviceType) {
        System.out.println("You have selected " + serviceType);
        System.out.println("Press 1 for Tech support, 2 for Billing, 3 to Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Connecting to " + serviceType + " Tech Support...");
                break;
            case 2:
                System.out.println("Connecting to " + serviceType + " Billing...");
                break;
            case 3:
                return; // Exit the service menu
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}