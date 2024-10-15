package org.ulpgc.is1.model;

public class Equiment extends Extra{
    public String name;

    public Equiment(String name, int dayPrices){
        super(dayPrices);
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
}
