import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice1;

        System.out.print("You must pick road A or road B: ");
        choice1 = scanner.nextLine();

        // Consequence of first choice (choice1)
        if (choice1.equals("a")) {
            System.out.println("You go by unhindered");
        } else if (choice1.equals("b")) {
            System.out.println("You are confronted by an animal");
        } else {
            System.out.println("You have selected an invalid option");
        }

        scanner.close();
    }
}

// Is text based adventure/RPG game
// Users can make choices
// Track user health points
// Track inventory using variables
// is if/else statements to control story