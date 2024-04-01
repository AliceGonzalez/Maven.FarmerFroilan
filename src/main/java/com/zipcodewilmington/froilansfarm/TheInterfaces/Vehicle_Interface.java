package com.zipcodewilmington.froilansfarm.TheInterfaces;

import com.zipcodewilmington.froilansfarm.Person.Person;

public interface Vehicle_Interface extends NoiseMaker_Interface, Rideable_Interface{
    public String makeNoise();
    public void addRider(Person person);
    public boolean removeRider();

}
