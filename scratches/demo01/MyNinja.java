package demo01;

import java.util.Arrays;

public class MyNinja {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        ninja.name = "Yoshi";
        ninja.level = 23;
        System.out.println(ninja.name);
        System.out.println(ninja.level);
        ninja.jump();
        ninja.walk();
        ninja.talk();

    }
}
