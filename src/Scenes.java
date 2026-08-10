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

    // maybe add meeting the merchant here

    protected static void merchantChoiceA(){
        System.out.println("You have selected the sword");
        hero.Inventory.add("sword");
    }

    protected static void merchantChoiceB(){
        System.out.println("You have selected the health potion");
        hero.Inventory.add("Health potion");
    }
}
