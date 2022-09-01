public class Pet {

    // properties
    String name;
    int trustlevel;
    int level;
    boolean ishappy;

    //contractor
    public void petDescription() {
        System.out.println("My pet's name is " + name + "\n" + "trustlevel = " + trustlevel + "\n" + "petlevel = " + level + "\n" + "ishappy = " + ishappy);
    }

    public Pet(String petname, int pettrustlevel, int petlevel, boolean condition) {
        name = petname;
        trustlevel = pettrustlevel;
        level = petlevel;
        ishappy = condition;
    }
}