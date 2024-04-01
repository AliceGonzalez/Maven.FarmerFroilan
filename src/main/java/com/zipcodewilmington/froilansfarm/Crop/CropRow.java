package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Food.Food;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Edible;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Produce_Interface;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import sun.jvm.hotspot.oops.Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class CropRow extends ArrayList<Crop> implements Produce_Interface {

ArrayList<Crop> plant = new ArrayList<>();
    boolean isFertilized;
    boolean isHarvested;
    public boolean isWatered;

    public Boolean hasBeenFertilized(){
        return isFertilized;
    }

    public Boolean hasBeenHarvested(){
        return isHarvested;
    }

    public Boolean hasBeenWatered(){
        return isWatered;
    }

    public void fertilize(){
        this.isFertilized = true;
    }

    public void harvest(){
        this.isHarvested = true;
    }

    public void waterCrops(){
        this.isWatered = true;
    }

}

// size method, return how many crops are in the row
// is empty, same as above just a boolean if its empty


