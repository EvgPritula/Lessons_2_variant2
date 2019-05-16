package com.epam.evgenia_pritula.java.lesson2.task2;
//variant 2
import com.epam.evgenia_pritula.java.Appliance.Fridge;
import com.epam.evgenia_pritula.java.Appliance.Iron;
import com.epam.evgenia_pritula.java.Appliance.Microwave;
import com.epam.evgenia_pritula.java.Appliance.Television;

public class Runner {

    public static void main(String[] args) {

        Fridge f1 = new Fridge(2000,50);
           f1.setMode(4);
           f1.setTurnedOn();


        Television t1 = new Television(1500,10);
                   t1.setDiagonally(32);
        Iron i1 = new Iron(1400,2);
             i1.setTurnedOn();
             i1.setSteaming(3);

        Microwave m1 = new Microwave(2000,7);
                  m1.unfreeze();

        System.out.println("\nAppliances in electrical network: ");
        System.out.println(ElectricalNetworksUtils.getAppliancesTurnedOn());
        System.out.println("Summary power: "+ ElectricalNetworksUtils.summaryPower());

        System.out.println("\nAppliances sorted by power:");
        ElectricalNetworksUtils.sortByPower();
        ElectricalNetworksUtils.outputAll();

        int power = 2000;
        int weight = 60;
        System.out.println("\nAppliances with power less than " + power + " vt " +
                "adn weight less than " + weight + " kg :" );
              System.out.println(ElectricalNetworksUtils.findApplianceByCriterion(power,weight));

    }
}
