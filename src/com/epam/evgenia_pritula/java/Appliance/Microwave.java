package com.epam.evgenia_pritula.java.Appliance;


import com.epam.evgenia_pritula.java.lesson2.task2.ElectricalNetworksUtils;

public class Microwave extends ElectricalAppliance {
    private Mode mode;

    public Microwave(int power, int weight ) {
        super(power, weight);
        ElectricalNetworksUtils.getAllAppliances().add(this);
    }

    public void heat(){
        this.mode = Mode.HEAT;
    }
    public void roast(){
        this.mode = Mode.ROAST;
    }

    public void unfreeze(){
       this.mode = Mode.UNFREEZE;
    }

   public void steam(){
       this.mode = Mode.STEAM;
            }
@Override
    public String toString(){
    return "Microwave {"+
            "power = " + getPower() +
            ", weight = " + getWeight() +
            ", mode = " + mode +
            '}';
}

}
enum Mode{HEAT,ROAST,UNFREEZE,STEAM}
