package com.diatsuda;

public class Mage extends Hero{

    private static final int health = 10;

    public Mage(String name) {
        super(name, health);
    };

    @Override
    public void attack(Enemy e) {
        System.out.println(this.name + " shoots " + e.getName());
        e.takeDamage(9);
    }
}
