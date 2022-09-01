public class item {
    // Properties
    int price;
    float weight;
    int quantity;
    String description;
    boolean canbetraded;
    String name;


    public void itemDescription() {
        System.out.println(name + "\n" + price + "g" + "\n" + "\n" + "weight = " + weight +  "\n" + "quantity = " + quantity + "\n" + "Description:" + "\n" + description + "\n" + "can be traded = " + canbetraded) ; 
    }
    
    public item(int itemPrice, float itemWeight, int itemQuantity, String itemDescription, boolean tradeable, String itemName) {
        price = itemPrice;
        weight = itemWeight;
        quantity = itemQuantity;
        description = itemDescription;
        canbetraded = tradeable;
        name = itemName;
    }
}