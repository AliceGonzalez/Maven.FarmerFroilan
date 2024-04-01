package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Botanist_Interface;

public class Bulbasaur extends Animal implements Botanist_Interface {
    String type;
    Double id;

    public Bulbasaur(String name,String type, Double id) {
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
    public String makeNoise() {
        return "BULBASAUR!!!";
    }

    @Override
    public void plant(CropRow croprow) {}

    @Override
    public void water(CropRow croprow) {}

    @Override
    public void nurture(CropRow croprow) {
        croprow.hasBeenNurtured = true;
    }

    @Override
    public void burn(CropRow croprow) {

    }

}
