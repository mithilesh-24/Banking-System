package main.java.com.bankingsystem.main;
import java.util.Scanner;
public class BankApplication {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice=0;
        System.out.println("💰Welcome to Banking System💰");
        do{
            System.out.println("1. Log-in");
            System.out.println("2. Sign-up");
            System.out.println("3. Exit");

            try {
                choice = Integer.parseInt(sc.next());

                if (choice < 1 || choice > 3) {
                    System.out.println("❌ Please enter a valid option (1–3)");
                    continue;
                }

                switch (choice) {
                    case 1 -> logIn();
                    case 2 -> signUp();
                    case 3 -> System.out.println("👋 Thank you for using Banking System");
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input! Enter numbers only.");
            }
        }while(choice!=3);
    }
}
