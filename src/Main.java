    import java.util.Scanner;

    public class Main {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            Hero hero = new Hero();
            Boss boss = new Boss();
            Scenes scenes = new Scenes();

            String choice1;
            String Service;
            String merchantChoice;
            String directChoice;
            String hpChoice;
            String bossResponse;

            System.out.print("You must pick room A or room B: ");
            choice1 = scanner.nextLine();

            // Consequence of first choice (choice1)
            if (choice1.equals("a")) {
                System.out.println("You go by unhindered");

//                System.out.println("You find a knight");
//                System.out.println("They ask 'who do you serve'");
//                System.out.print("you reply I serve, (a. no-one only myself, b. I serve the new king, c. The old king): ");
                Scenes.Choice1();

                Service = scanner.nextLine();

                // story paths for second choice (Service)
                if (Service.equals("a")) {
//                    System.out.println("The knight takes a moment thinking");
//                    System.out.println("You begin to make your excuses to leave.");
//                    System.out.println("The knight moves to block your path and pull his sword");
//                    System.out.println("You push your way past the knight before they pull their sword, sending them tumbling down an embankment");
//                    System.out.println("You escape unharmed, barely");
                    Scenes.SerivceA();
                } else if (Service.equals("b")) {
//                    System.out.println("The knight makes no move to block your path and you continue your journey");
                    Scenes.SerivceB();
                } else if (Service.equals("c")) {
//                    System.out.println("The knight draws their sword and swings at you");
//                    System.out.println("Their blade connects");
//                    hero.health -= 10;
//                    System.out.println("You stumble backwards falling down the embankment into some shrubs, hidden.");
//                    System.out.println("Your remaining health is: " + hero.health);
                    Scenes.SerivceC();
                }

                // find the treasure
                System.out.println("You come to the spot marked on your map");
                System.out.println("You begin to dig");
                System.out.println("You soon hit something hard underneath the soft ground");
                System.out.println("You find the chest the rumors foretold");
                System.out.println("You open it and find it filled with gold coins");
                System.out.println("You fill your bags and go on your way");

                // meet the merchant
                System.out.println("As you enter the room you encounter an unknown man");
                System.out.println("He calls you to come over, and asks if you want to see what he has for sale");
                System.out.println("A. Sword (+10 attack)");
                System.out.println("B. Health potion (+10 HP restore)");
                merchantChoice = scanner.nextLine();

                if (merchantChoice.equals("a")){
//                    System.out.println("You have selected the sword");
//                    hero.Inventory.add("sword");
                    Scenes.merchantChoiceA();
                } else if (merchantChoice.equals("b")) {
//                    System.out.println("You have selected the health potion");
//                    hero.Inventory.add("Health potion");
                    Scenes.merchantChoiceB();
                }

                // Boss fight
                System.out.println("Inventory: " + hero.Inventory);
                System.out.println("You leave the merchant and walk through the large door");
                System.out.println("In the room you meet the dark king");
                System.out.println("You use the item you bought from the merchant"); // sword or health potion
                System.out.println("The dark king attacks");
                System.out.println("You move left or right: ");
                directChoice = scanner.nextLine();

                if (directChoice.equals("left")) {
                    System.out.println("The blade moves past your face by millimeters");
                } else {
                    System.out.println("The blade slices across your face drawing blood");
                    System.out.println("The attack causes +10 damage");
                    hero.health -= 10;
                    System.out.println("Your health is now: " + hero.health);
                }

                // prompts health consideration
                if (hero.health < 100) {
                    System.out.println("Inventory: " + hero.Inventory);
                    System.out.println("Do you have a health potion (Y/N): ");
                    hpChoice = scanner.nextLine();

                    if (hpChoice.equals("y")) {
                        hero.health += 10;
                        System.out.println("Your health is now: " + hero.health);
                    } else {
                        System.out.println("You do not have any health potions");
                    }
                }

                // attacking the boss
                System.out.println("You move to attack");
                // if statement that checks if inventory has sword
                if(hero.Inventory.contains("sword")) {
                    hero.attack += 10;
                    System.out.println("You attack with 15 damage");
                    boss.health -= hero.attack;
                    System.out.println("The Dark kings health is: " + boss.health);
                } else {
                    System.out.println("You attack with 5 damage");
                }

                // Boss Response
                System.out.println("The dark king attacks from the right");
                System.out.println("You can: A. parry or B. side-step");
                bossResponse = scanner.nextLine();

                if (bossResponse.equals("a")) {
                    System.out.println("You parry the strike");
                    if (hero.Inventory.contains("sword")) {
                        System.out.println("You drive your sword through the dark kings heart, killing him");
                    }
                } else if (bossResponse.equals("b")) {
                    System.out.println("You have no sword");
                    hero.health -= boss.attack;
                } else {
                    System.out.println("You chose wrong");
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
// road A, find treasure, meet merchant, boss fight
// road B, meet knight, cross broken bridge, fight wolf, boss