package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Eater_Interface;
import com.zipcodewilmington.froilansfarm.TheInterfaces.NoiseMaker_Interface;

public class Animal implements Eater_Interface, NoiseMaker_Interface {
    String name;
    public Animal(String name) {
        this.name = name;
    }


    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public Boolean eat(Integer amountOfEat, Object o) {
        return null;
    }
}
