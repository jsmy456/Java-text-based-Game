import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice1;
        String Service;

        System.out.print("You must pick road A or road B: ");
        choice1 = scanner.nextLine();

        // Consequence of first choice (choice1)
        if (choice1.equals("a")) {
            System.out.println("You go by unhindered");

            System.out.print("You find a knight");
            System.out.print("They ask 'who do you serve'");
            System.out.print("you reply I serve, a. no-one only myself, b. I serve the new king, c. The old king");
            Service = scanner.nextLine();

            // story paths for second choice (Service)
            if (Service.equals("a")) {
                System.out.println("The knight takes a moment thinking");
                System.out.println("You begin to make your excuses to leave.");
                System.out.println("The knight moves to block your path and pull his sword");
                System.out.println("You push your way past the knight before they pull their sword, sending them tumbling down an embankment");
                System.out.println("You escape unharmed, barely");
            } else if (Service.equals("b")) {
                System.out.println("The knight makes no move to block your path and you continue your journey");
            } else if (Service.equals("c")) {
                System.out.println("The knight draws their sword and swings at you");
                System.out.println("Their blade connects");
                // Need to add Hero class here - subtract attack from hero health
                System.out.println("You stumble backwards falling down the embankment into some shrubs, hidden.");
            }
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