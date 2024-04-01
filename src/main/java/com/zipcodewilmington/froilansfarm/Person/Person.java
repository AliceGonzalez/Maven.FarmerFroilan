package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Eater_Interface;

public class Person extends Animal implements Eater_Interface.Eater_Interface {
    String name;

    public Person(String name) {
        super(name);
    }

    public void add(Person  person) {
    }

    public String getName() {
        return name;
    }

    public void setName() { this.name = name;
    }

    public boolean eat() {
        return false;
    }

    @Override
    public void eat(EarCorn earCorn, int i) {

    }

    @Override
    public Boolean eat(Integer amountOfEat, Object o) {
        return null;
    }
}
