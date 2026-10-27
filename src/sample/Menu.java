package sample;
import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1: 
                    System.out.println("You selected Addition."); 
                    break;
                case 2: 
                    System.out.println("You selected Subtraction."); 
                    break;
                case 3: 
                    System.out.println("You selected Multiplication."); 
                    break;
                case 4: 
                    System.out.println("You selected Division."); 
                    break;
                case 5: 
                    System.out.println("Exiting... Goodbye!"); 
                    break;
                default: 
                    System.out.println("Invalid choice, try again!");
            }
        } while(choice != 5);

        sc.close();
    }
}
