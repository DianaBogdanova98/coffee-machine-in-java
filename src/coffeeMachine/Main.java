package coffeeMachine;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        int water = cups * 200;
        int milk = cups * 50;
        int coffee = cups * 15;
        System.out.print("Write how many cups of coffee you will need: ");
        System.out.println(cups);
        System.out.print ("For ");
        System.out.print (cups);
        System.out.println (" cups of coffee you will need: ");
        System.out.print (water);
        System.out.println (" ml of water");
        System.out.print (milk);
        System.out.println (" ml of milk ");
        System.out.print (coffee);
        System.out.println(" g of coffee beans");

    }
}