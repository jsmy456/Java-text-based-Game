public class Scenes {
    static Hero hero = new Hero();

    protected static void Choice1() {
        System.out.println("You find a knight");
        System.out.println("They ask 'who do you serve'");
        System.out.print("you reply I serve, (a. no-one only myself, b. I serve the new king, c. The old king): ");
    }

    protected static void SerivceA() {
        System.out.println("The knight takes a moment thinking");
        System.out.println("You begin to make your excuses to leave.");
        System.out.println("The knight moves to block your path and pull his sword");
        System.out.println("You push your way past the knight before they pull their sword, sending them tumbling down an embankment");
        System.out.println("You escape unharmed, barely");
    }

    protected static void SerivceB() {
        System.out.println("The knight makes no move to block your path and you continue your journey");
    }

    protected static void SerivceC(){
        System.out.println("The knight draws their sword and swings at you");
        System.out.println("Their blade connects");
        hero.health -= 10;
        System.out.println("You stumble backwards falling down the embankment into some shrubs, hidden.");
        System.out.println("Your remaining health is: " + hero.health);
    }

    // Maybe add finding the treasure here
    protected static void treasure(){
        System.out.println("You come to the spot marked on your map");
        System.out.println("You begin to dig");
        System.out.println("You soon hit something hard underneath the soft ground");
        System.out.println("You find the chest the rumors foretold");
        System.out.println("You open it and find it filled with gold coins");
        System.out.println("You fill your bags and go on your way");
    }
    // maybe add meeting the merchant here
    protected static void merchant(){
        System.out.println("As you enter the room you encounter an unknown man");
        System.out.println("He calls you to come over, and asks if you want to see what he has for sale");
        System.out.println("A. Sword (+10 attack)");
        System.out.println("B. Health potion (+10 HP restore)");
    }

    protected static void merchantChoiceA(){
        System.out.println("You have selected the sword");
        hero.Inventory.add("sword");
    }

    protected static void merchantChoiceB(){
        System.out.println("You have selected the health potion");
        hero.Inventory.add("Health potion");
    }

    protected static void boss(){
        System.out.println("Inventory: " + hero.Inventory);
        System.out.println("You leave the merchant and walk through the large door");
        System.out.println("In the room you meet the dark king");
        System.out.println("You use the item you bought from the merchant"); // sword or health potion
        System.out.println("The dark king attacks");
        System.out.println("You move left or right: ");
    }
}
