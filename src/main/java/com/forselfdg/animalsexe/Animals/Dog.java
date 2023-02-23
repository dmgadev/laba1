package com.forselfdg.animalsexe.Animals;

public class Dog extends Animal {
       public Dog(String name, boolean walk, boolean swim, int rangeWalk, int rangeSwim) {
        this.name = name;
        this.walkorswim = walkorswim;
        this.rangeWalk = rangeWalk;
        this.rangeSwim = rangeSwim;
    }

    @Override
    public void runAndSwim() {
        if (rangeWalk > 500) {
            System.out.println(name + " " + "не пробежал" + " " + rangeWalk + " " + "м.");
        } else {
            System.out.println(name + " " + "пробежал" + " " + rangeWalk + " " + "м.");
        }
        if (rangeSwim > 10) {
            System.out.println(name + " " + "не проплыл" + " " + rangeSwim + " " + "м.");
        }
        else {
            System.out.println(name + " " + "проплыл" + " " + rangeSwim + " " + "м.");

        }

    }
}