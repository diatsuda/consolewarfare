package com.diatsuda;

public class Enemy implements Mortal {
    public int health;
    public String name;

    public Enemy (String name) {
        this.name = name;
        this.health = 10;
    };
    public String getName() {
        return name;
    };

    public void setName(String name) {
        this.name = name;
    };

    public void attack(Hero hero) {
        System.out.println(name + " attacks!" + hero);
    };

    public void takeDamage(int damage) {
        this.health -= damage;
    };

    public void die() {
        System.out.println(name + " deceased.");
        this.health = 0;
    }

    public boolean isAlive() {
        return this.health > 0;
    };
}
