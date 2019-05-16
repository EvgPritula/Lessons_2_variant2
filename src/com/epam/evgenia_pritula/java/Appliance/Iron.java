package com.epam.evgenia_pritula.java.Appliance;

import com.epam.evgenia_pritula.java.lesson2.task2.ElectricalNetworksUtils;

public class Iron extends ElectricalAppliance {
    private int steaming;

    public Iron(int power, int weight) {
        super(power, weight);
        ElectricalNetworksUtils.getAllAppliances().add(this);
    }

    public int getSteaming(){
       return steaming;
   }

    public void setSteaming(int steaming) {
        this.steaming = steaming;
        }

        @Override
    public String toString() {
            return "Iron { "+
                    "power = " + getPower() +
                    ", weight = " + getWeight() +
                    ", steaming = " + steaming +
                    '}';
        }
}
