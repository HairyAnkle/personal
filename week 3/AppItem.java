public class AppItem {
    public static void main(String[] args) {
        // items
        item Weapon = new item(10, 3, 1, "increase critical damage and critical rate by 100. 100% chance to execute pve and pvp. Unique Passive: increase attack damage by 100%", true, "Victor Magtanggol's Legendary Weapon");
        Weapon.itemDescription();

        item Boots = new item(8, 2, 1, "increase movement speed and evasion by 100", true, "Victor Magtanggol's Legendary Boots");
        Boots.itemDescription();

        item Armor = new item(8, 1, 2, "increase dodge rate, magic and physical defense by 100%", true, "Victor Magtanggol's Legendary Armor");
        Armor.itemDescription();
    }


}