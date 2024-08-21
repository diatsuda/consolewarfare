package com.diatsuda;

public class TrainingGround {
    public static void main(String[] args) {
        Warrior testHero = new Warrior("John");
        Enemy testEnemy = new Enemy("Jack");
        testHero.attack(testEnemy);
    }
}
