package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Botanist_Interface;

public class Squirtle extends Animal implements Botanist_Interface {
    String type;
    Double id;

    public Squirtle(String name,String type, Double id) {
        super(name);
        this.type = type;
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setId(Double id){
        this.id = id;
    }
    public Double getId(){
        return id;
    }
    public String makeNoise(){
        return "SQUIRTLEEEEE!!!";
    }

    @Override
    public void plant(CropRow croprow) {

    }
    @Override
    public void water(CropRow croprow) {
        croprow.isWatered = true;
    }

    @Override
    public void nurture(CropRow croprow) {

    }

    @Override
    public void burn(CropRow croprow) {

    }
}
