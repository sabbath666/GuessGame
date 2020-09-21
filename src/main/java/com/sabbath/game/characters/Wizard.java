package com.sabbath.game.characters;

public class Wizard extends Player{
    public String name;

    public Wizard(String name) {
        this.name = name;
    }

    public void kill() {
        System.out.println("Вжух-Вжух");
    }

    public void say() {
        System.out.println("Я предвидел");
    }

}
