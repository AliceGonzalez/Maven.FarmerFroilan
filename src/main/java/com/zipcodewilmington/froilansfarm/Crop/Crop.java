package com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Edible;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Produce_Interface;
public abstract class Crop implements Produce_Interface {
    boolean isFertilized;
    boolean isHarvested;
    boolean isWatered;


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

