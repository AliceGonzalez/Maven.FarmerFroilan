package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Rideable_Interface;

public class Rapidash extends Animal implements Rideable_Interface {
    public boolean hasBeenRidden;
    String type;
    Double id;
    public Rapidash(String name,String type, Double id) {
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
        return "NEIGHHHH!!!";
    }

    public void addRider(Person froilan) {
    }

    @Override
    public Boolean hasBeenRidden() {
        return null;
    }

    @Override
    public Person addRider() {
        return null;
    }
}
