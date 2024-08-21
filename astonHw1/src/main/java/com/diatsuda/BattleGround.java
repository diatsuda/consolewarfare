package com.diatsuda;

public class BattleGround {
    public static void main(String[] args) {
        Warrior hero = new Warrior("John");
        Enemy enemy = new Enemy("Jack");

        while (enemy.isAlive()) {
            hero.attack(enemy);
            if (enemy.health <= 0) {
                enemy.die();
            }
        };


    }
}
