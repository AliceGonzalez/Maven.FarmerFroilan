package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Vehicle_Interface;

public class Tractor implements Vehicle_Interface {
    public boolean haspilot;

    public <CropRow> void harvest(CropRow cropRow) {
    }

    public String makeNoise() {
        return null;
    }

    @Override
    public void addRider(Person person) {

    }

    @Override
    public void removeRider() {

    }

//    public boolean removeRider() {
//        return false;
//    }

    public void fertilize(CropRow cropRow) {
    }


    public void addRider(Pilot pilot) {
    }

    public void fly() {
    }

    @Override
    public Boolean hasBeenRidden() {
        return null;
    }
}
