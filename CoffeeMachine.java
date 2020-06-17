/********************************************************
* Created by Victor Hugo on 16th June, 2020.
* Learning Java with JetBrains Academy Java Course.
* A Simple Coffee Machine Written in Java.
********************************************************/

package machine;
import java.util.Scanner;

public class CoffeeMachine {
    final static Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) {
        startMachine();
        howManyCoffee();
    }
    // Just start up our machine and print some informations.
    static void startMachine() {    
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }
    
    /***************************************************************** 
    *  On the second stage, we need to inform the quantity of cups we 
    *  want, then the program will calculate the amount of ingredients
    *  needed to make coffee.
    ******************************************************************/
    static void howManyCoffee() {
        System.out.println("Write how many cups of coffee you will need: ");
        int amountOfCoffe = scanner.nextInt();
        int amountOfWater = amountOfCoffe * 200;    // 200ml of water = 1 cup
        int amountOfMilk = amountOfCoffe * 50;      // 50 ml of milk = 1 cup
        int amountOfBeans = amountOfCoffe * 15;     // 15 g of coffee beans = 1 cup
        
        System.out.println("For " + amountOfCoffe + " cups you will need:");
        System.out.println(amountOfWater + " ml of water");
        System.out.println(amountOfMilk + " ml of milk");
        System.out.println(amountOfBeans + " g of coffee beans");
    }
}
