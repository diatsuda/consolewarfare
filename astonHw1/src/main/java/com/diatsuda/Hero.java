package com.diatsuda;

public abstract class Hero implements Mortal {
    public String name;
    public int health;

    public Hero (String name, int healthMax) {
        this.name = name;
        this.health = 10;
    };
    public String getName() {
        return name;
    };
    public void setName(String name) {
        this.name = name;
    };

    public abstract void attack(Enemy e);

    public void takeDamage(int damage) {
        this.health -= damage;
    };

    public boolean isAlive() {
        return this.health > 0;
    };

    public void die() {
        System.out.println(name + " deceased.");
        this.health = 0;
    }
}