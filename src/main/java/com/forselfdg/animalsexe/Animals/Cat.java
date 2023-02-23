package com.forselfdg.animalsexe.Animals;

public class Cat extends Animal {

        final boolean swim = false;

        public Cat(String name, boolean walk, boolean swim, int rangeWalk, int rangeSwim) {
        this.name = name;
        this.walkorswim = walkorswim;
        this.rangeWalk = rangeWalk;
        this.rangeSwim = rangeSwim;
    }

    @Override
    public void runAndSwim() {
           if (rangeWalk > 200) {
                    System.out.println(name + " " + "не пробежал" + " " + rangeWalk + " " + "м.");
            }
            else {
                System.out.println(name + " " + "пробежал" + " " + rangeWalk + " " + "м.");
            }
           if (!swim) {
            System.out.println(name + " " + "не умеет плавать.");
        }
    }

}

