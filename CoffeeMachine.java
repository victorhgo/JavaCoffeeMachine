 
/********************************************************
 * Created by Victor Hugo on 16th June, 2020.
 * Learning Java with JetBrains Academy Java Course.
 * A Simple Coffee Machine Written in Java.
 ********************************************************/

package machine;
import java.util.Scanner;

public class CoffeeMachine {
    final static Scanner scanner = new Scanner(System.in);

    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    public static void main(String[] args) {

        boolean shutdown = true;

        do {
            System.out.println("Write action (buy, " +
                    "fill, take, remaining, exit): ");
            String option = scanner.next();

            switch (option) {
                case "buy":
                    System.out.println("What do you want to buy?" +
                            " 1 - espresso, 2 - latte, 3 - cappuccino, " +
                            "back - to main menu: ");

                    String buyOption = scanner.next();
                    switch (buyOption) {
                        case "1":
                            buyEspresso();
                            break;
                        case "2":
                            buyLatte();
                            break;
                        case "3":
                            buyCappuccino();
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups += scanner.nextInt();

                    remaining(water, milk, beans, cups, money);
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    remaining(water, milk, beans, cups, money);
                    break;
                case "exit":
                    shutdown = false;
                    break;
            }
        } while (shutdown);

    }

    public static void buyEspresso() {
        if (water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (beans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");

            water -= 250;
            beans -= 16;
            cups--;
            money += 4;
        }
    }
    public static void buyLatte() {
        if (water < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (beans < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            beans -= 20;
            cups--;
            money += 7;
        }
    }
    public static void buyCappuccino() {
        if (water < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (beans < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            beans -= 12;
            cups--;
            money += 6;
        }

    }
    private static void remaining(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                money + " of money\n");
    }
}
