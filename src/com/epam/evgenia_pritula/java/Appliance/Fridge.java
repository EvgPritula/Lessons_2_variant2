package com.epam.evgenia_pritula.java.Appliance;

import com.epam.evgenia_pritula.java.lesson2.task2.ElectricalNetworksUtils;

public class Fridge extends ElectricalAppliance {
    private int mode;
   // public boolean isTurnedOn;

    public Fridge(int power,int weight) {
        super(power, weight);
        ElectricalNetworksUtils.getAllAppliances().add(this);
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    @Override
    public String toString(){
        return "Fridge {"+
                "power = " + getPower() +
                ", weight = " + getWeight() +
                ", mode = " + mode +
                '}';
    }

}
