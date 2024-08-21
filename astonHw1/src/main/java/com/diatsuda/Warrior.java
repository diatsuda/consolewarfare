package com.diatsuda;

public class Warrior extends Hero{

    private static final int health = 10;

    public Warrior (String name) {
        super(name, health);
    };

    @Override
    public void attack(Enemy e) {
        System.out.println(this.name + " attacks " + e.getName());
        e.takeDamage(2);
    };

}
