package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Rideable_Interface;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Vehicle_Interface;

public class AirCraft implements Vehicle_Interface, Rideable_Interface {

    public boolean haspilot;

    public void addPilot(Pilot pilot) {
    }

    public Boolean hasBeenRidden() {
        return false;
    }

    public String makeNoise() {
        return null;
    }

    @Override
    public void addRider(Person person) {

    }
    @Override
    public Person addRider() {
        return null;
    }

    @Override
    public boolean removeRider() {

        return false;
    }
    public void fly() {
    }


    public boolean hasRidder() {
        return false;
    }


    public void fertilize(CropRow cropRow) {
    }
}
