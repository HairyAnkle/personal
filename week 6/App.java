
// import the Scanner class
import java.util.Scanner;

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Creamy Spinach Pizza that costs 400.00 pesos");
        System.out.println("Enter B if you want a Four Cheese Pizza that costs 300.00 pesos");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);

        String pizza = "";
        double price = 0;

        switch (choice) {
            case 'A':
                pizza = "Creamy Garlic & 5 Cheese";
                price = 355.00;
                break;
            case 'B':
                pizza = "Four Cheese Pizza";
                price = 300.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }
        System.out.println("What type of crust? Choose 1");
        System.out.println("Enter A if you want Hand Tossed");
        System.out.println("Enter B if you want Thin Crust");
       
        char typeofCrust = scan.next().charAt(0);

        String crustType = "";

        switch (typeofCrust) {
            case 'A':
                crustType = "Hand Tossed";
                
            case 'B':
                crustType = "Thin Crust";
                break;
            default:
                System.out.println("Please, choose between A and B");
                break;
        }
        System.out.println("What size do you want sir? Choose 1 ");
        System.out.println("Enter A if you want Medium size'' ");
        System.out.println("Enter B if you want Family size");
        System.out.println("Enter C if you want Big Family size");
        
        char size = scan.next().charAt(0);
        String pizzaSize = "";

        switch (size) {
            case 'A':
            pizzaSize = "Medium size";
            price = 355.00;
            break;
            
            case 'B':
            pizzaSize = "Family size";
            price = price + 150;
            break;

            case 'C':
            pizzaSize = "Big Family size";
            price = price + 255;
            break;

            default:
                System.out.println("Please, choose between A, B and C");
                break;
        }

        System.out.println("Enter Quantity of pizzas");

        int choice2 = scan.nextInt();

        price = price * choice2;
  
        System.out.println("Your order is: " + choice2 + " of " + pizza + " " + crustType + " " + pizzaSize);
        System.out.println("Your total amount is: " + price);

        scan.close();
    }
    
}
