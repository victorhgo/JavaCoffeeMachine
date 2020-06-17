package machine;
import java.util.Scanner;

public class CoffeeMachine {
    final static Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) {
        startMachine();
        howManyCoffee();
    }
  
    static void startMachine() {    
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }
    static void howManyCoffee() {
        System.out.println("Write how many cups of coffee you will need: ");
        int amountOfCoffe = scanner.nextInt();
        int amountOfWater = amountOfCoffe * 200;
        int amountOfMilk = amountOfCoffe * 50;
        int amountOfBeans = amountOfCoffe * 15;
        System.out.println("For " + amountOfCoffe + " cups you will need:");
        System.out.println(amountOfWater + " ml of water");
        System.out.println(amountOfMilk + " ml of milk");
        System.out.println(amountOfBeans + " g of coffee beans");
    }
}
