package com.company;

import java.util.Random;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {
        Father objectFather = new Father(random.nextInt(100) + 1, "Alexandre", 1.85, Hobby.HOCKEY, mobilePhone.IPHONE_X);
        Son objectAlex = new Son(random.nextInt(20) + 1, "Alex", random.nextInt(200) + 1, Hobby.HOCKEY, mobilePhone.IPHONE_5S);
        Son objectSasha = new Son(random.nextInt(20) + 1, "Sasha", random.nextInt(200) + 1, Hobby.MOBILE_GAMES, mobilePhone.IPHONE_5S);




        System.out.println("__________________");

        System.out.println(objectFather.getInfo());
        Father.Ability(random.nextBoolean());
        Father.Ability(random.nextBoolean(), random.nextInt(120) + 1);
        Father.Ability(random.nextInt(100) + 1, random.nextBoolean());

        System.out.println("__________________");

        System.out.println(objectAlex.getInfo());
        Son.Ability(random.nextBoolean());
        Son.Ability(random.nextBoolean(), random.nextInt(120) + 1);
        Son.Ability(random.nextInt(100) + 1, random.nextBoolean());

        System.out.println("__________________");

        System.out.println(objectSasha.getInfo());
        Son.Ability(random.nextBoolean());
        Son.Ability(random.nextBoolean(), random.nextInt(120) + 1);
        Son.Ability(random.nextInt(100) + 1, random.nextBoolean());

        System.out.println("__________________");

    }
}
