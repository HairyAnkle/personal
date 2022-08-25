public class App {
    public static void main(String[] args) {
        
        //based on my computer game MMORPG, League of Angels - Heavens Fury
        Character Dragoon = new Character();

        Dragoon.strength = 9;
        Dragoon.agility = 7;
        Dragoon.intelligence = 3;
        Dragoon.name = "Akira";
        Dragoon.sayMyName();
        Dragoon.sayMystrength();
        Dragoon.sayMyagility();
        Dragoon.sayMyintelligence();
        
        Character mage = new Character();

        mage.strength = 4;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Legion";
        mage.sayMyName();
        mage.sayMyagility();
        mage.sayMystrength();
        mage.sayMyintelligence();
        
        Character archer = new Character();

        archer.strength = 5;
        archer.agility = 10;
        archer.intelligence = 4;
        archer.name = "Shen Yue";
        archer.sayMyName();
        archer.sayMystrength();
        archer.sayMyagility();
        archer.sayMyintelligence();
    }
}
