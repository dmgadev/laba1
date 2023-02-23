package com.forselfdg.animalsexe;

import com.forselfdg.animalsexe.Animals.*;

public class MainApp {
    public static void main(String[] args) {
        int catCounter = 0;
        int dogCounter = 0;
        int tigerCounter = 0;
        Animal[] allAnimals = {
                new Cat("Борис", true, false, 150, 0),
                new Dog("Персик", true, true, 300, 5),
                new Cat("Моисей", true, false,150, 0),
                new Dog("Лотта", true, true, 370, 30),
                new Tiger("Лео", true, true , 100, 5),
                new Tiger("Тигга", true, true, 400, 10),
                new Tiger("Нигга", true, true, 300, 53),
        };
        for (Animal KollektAnimals : allAnimals) {
        KollektAnimals.runAndSwim();
            if (KollektAnimals instanceof Cat) {
                catCounter++;
            }
            if (KollektAnimals instanceof Dog) {
                dogCounter++;
            }
            if (KollektAnimals instanceof Tiger) {
                tigerCounter++;
            }
        }

        System.out.println( '\n' + "Всего животных: " + allAnimals.length);
        System.out.println( '\n' + "Котов: " + catCounter + '\n' + "Собак: " + dogCounter + '\n' + "Тигров: " + tigerCounter);
          }
}