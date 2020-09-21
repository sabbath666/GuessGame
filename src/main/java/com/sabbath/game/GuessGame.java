package com.sabbath.game;

import com.sabbath.game.characters.Player;
import com.sabbath.game.characters.Robot;
import com.sabbath.game.characters.Troll;
import com.sabbath.game.characters.Wizard;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessGame {

    // Игра приветвует, выводит правила
    // Комп загадывает число
    // Игрок угадывает число от 0 до 10 c 3 попыток

    public static void main(String[] args) {
        Player player = createCharacter("Джорж", "robowedrgt");
        playGame(player);
    }

    private static Player createCharacter(String name, String type) {
        switch (type) {
            case "troll":
                return new Troll(name);
            case "wizard":
                return new Wizard(name);
            case "robot":
                return new Robot(name);
            default:
                throw new RuntimeException("Нет такого класса!!");
        }
    }

    private static void playGame(Player player) {
        int number = ThreadLocalRandom.current().nextInt(0, 10);
        System.out.println("Мое число: " + number);
        System.out.println("Введи число от 0 до 10:");
        int count = 0;
        boolean guessed = false;
        while (count < 3 && !guessed) {
            count++;
            System.out.println("Попытка №" + count);
            Scanner scanner = new Scanner(System.in);
            int myNumber = scanner.nextInt();
            if (myNumber == number) {
                System.out.println("Угадал!!");
                guessed = true;
                player.say();
            }
        }
        if (count == 3 && !guessed) {
            System.out.println("Неудачник!!");
            player.kill();
        }
    }
}
