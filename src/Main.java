    import java.util.Scanner;

    public class Main {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            Hero hero = new Hero();

            String choice1;
            String Service;
            String merchantChoice;

            System.out.print("You must pick road A or road B: ");
            choice1 = scanner.nextLine();

            // Consequence of first choice (choice1)
            if (choice1.equals("a")) {
                System.out.println("You go by unhindered");

                System.out.println("You find a knight");
                System.out.println("They ask 'who do you serve'");
                System.out.print("you reply I serve, (a. no-one only myself, b. I serve the new king, c. The old king): ");
                Service = scanner.nextLine();

                // story paths for second choice (Service)
                if (Service.equals("a")) {
                    System.out.println("The knight takes a moment thinking");
                    System.out.println("You begin to make your excuses to leave.");
                    System.out.println("The knight moves to block your path and pull his sword");
                    System.out.println("You push your way past the knight before they pull their sword, sending them tumbling down an embankment");
                    System.out.println("You escape unharmed, barely");

                    // need to add next act
                    System.out.println("You ");
                } else if (Service.equals("b")) {
                    System.out.println("The knight makes no move to block your path and you continue your journey");

                    // need to add next act
                } else if (Service.equals("c")) {
                    System.out.println("The knight draws their sword and swings at you");
                    System.out.println("Their blade connects");
                    // Need to add Hero class here - subtract attack from hero health
                    hero.health -= 10;
                    System.out.println("You stumble backwards falling down the embankment into some shrubs, hidden.");
                    System.out.println("Your remaining health is: " + hero.health);
                }
                // need to add next act - find the treasure
                System.out.println("You come to the spot marked on your map");
                System.out.println("You begin to dig");
                System.out.println("You soon hit something hard underneath the soft ground");
                System.out.println("You find the chest the rumors foretold");
                System.out.println("You open it and find it filled with gold coins");
                System.out.println("You fill your bags and go on your way");

                // meet the merchant
                System.out.println("As you enter the room you encounter an unknown man");
                System.out.println("He calls you to come over, and asks if you want to see what he has for sale");
                System.out.println("A. Sword (+5 attack)");
                System.out.println("B. Health potion (+10 HP restore)");
                merchantChoice = scanner.nextLine();

                if (merchantChoice.equals("a")){
                    System.out.println("You have selected the sword");
                } else if (merchantChoice.equals("b")) {
                    System.out.println("You have selected the health potion");
                }

                // Boss fight
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
// road A, find treasure, meet merchant, boss fight
// road B, meet knight, cross broken bridge, fight wolf, boss