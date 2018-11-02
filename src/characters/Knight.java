package characters;

import weapons.WeaponBehavior;

public class Knight extends Character {

    public Knight(String name) {
        super(name);
    }

    public Knight(String name, WeaponBehavior weaponBehavior) {
        super(name, weaponBehavior);
    }

    public void fight(Character opponent) {
        if (weaponBehavior() == null) {
            System.out.println("Hitting and kicking (in lack of a weapon!)");
            opponent.takeDamage(5);
        } else {
            System.out.println(name() + " uses its " + weaponBehavior() + " against " + opponent.name());
            opponent.takeDamage(weaponBehavior().useWeapon());
        }
        System.out.println("Score after Attack: " + this + " - " + opponent);
    }

}
