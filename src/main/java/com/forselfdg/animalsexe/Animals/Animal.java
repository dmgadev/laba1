package com.forselfdg.animalsexe.Animals;

public class Animal {
    protected String name;
    protected String walkorswim;
    protected boolean walk;
    protected boolean swim;
    protected int rangeWalk;
    protected int rangeSwim;
    public void runAndSwim() {
        System.out.println(name + " " + "пробежал" + " " + rangeWalk + " " + "м.");
        System.out.println(name + " " + "проплыл" + " " + rangeSwim + " " + "м.");
    }


}

