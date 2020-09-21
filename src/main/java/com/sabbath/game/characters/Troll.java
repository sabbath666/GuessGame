package com.sabbath.game.characters;

public class Troll extends Player {
    public String name;

    public Troll(String name) {
        this.name = name;

    }

    public void kill() {
        System.out.println("Дыщь-Дыщь");
    }

    public void say() {
        System.out.println("Моя угадал");
    }

}
