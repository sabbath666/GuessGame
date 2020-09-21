package com.sabbath.game.characters;

public class Robot extends Player {
    public String name;

    public Robot(String name) {
        this.name = name;
    }


    @Override
    public void kill() {
        System.out.println("Пыщь-пыщь");
    }

    @Override
    public void say() {
        System.out.println("Бип-Бип");
    }

}
