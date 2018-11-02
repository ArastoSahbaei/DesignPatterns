package characters;

import weapons.WeaponBehavior;

public abstract class Character {
    private WeaponBehavior weaponBehavior;
    private String name;
    private int health = 100;

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, WeaponBehavior weaponBehavior) {
        this(name);
        this.weaponBehavior = weaponBehavior;
    }

    public String name() {
        return name;
    }

    public void changeWeapon(WeaponBehavior weaponBehaviour) {
        this.weaponBehavior = weaponBehavior;
    }

    public WeaponBehavior weaponBehavior() {
        return weaponBehavior;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public abstract void fight(Character opponent);

    public int health() {
        return health;
    }

    public String toString() {
        return name +
                " with health: " + health + " "
                + ((weaponBehavior != null) ? "wielding the " + weaponBehavior : "");
    }

}
