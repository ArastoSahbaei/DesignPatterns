import characters.Knight;
import characters.Troll;
import weapons.Club;
import weapons.Shotgun;
import weapons.Sword;

public class Main {

    public static void main(String[] args) {
        Troll troll = new Troll("Mr.Mjauw, son of Pikachu, last of his kin", new Club());
        Knight knight = new Knight("Bruce, the almighty", new Sword());

        troll.fight(knight);
        knight.fight(troll);
        troll.changeWeapon(new Shotgun());
        System.out.println("The Troll equips a motherfucking shotgun! " + "\n" + knight.name() + " starts running for his life!");
        System.out.println("The Troll aims the weapon towards the almost defeated knightly knight and fires a round towards his ass and puts him into a final sleep");
        troll.fight(knight);
    }
}
