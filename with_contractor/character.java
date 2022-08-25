public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("My name is " + name + "\n" + "My Strength is " + strength + "\n" + "My Agility is " + agility + "\n" + "My intelligence is " + intelligence + "\n");
    }

    public Character(int str, int agi, int intel, String characterName) {
        name = characterName;
        strength = str;
        agility = agi;
        intelligence = intel;
        
    }
       
}
