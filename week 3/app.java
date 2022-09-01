public class App {
    public static void main(String[] args) {
    
        //Pet class

        Pet dog = new Pet("Asta", 5, 10, true);
        dog.petDescription();

        Pet cat = new Pet("Finral", 3, 8, true);
        cat.petDescription();

        Pet bird = new Pet("Secre", 5, 8, false);
        bird.petDescription();


    }
}
