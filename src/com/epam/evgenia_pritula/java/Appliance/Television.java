package com.epam.evgenia_pritula.java.Appliance;

import com.epam.evgenia_pritula.java.lesson2.task2.ElectricalNetworksUtils;

public class Television extends ElectricalAppliance {
        private int diagonally;

        public Television(int power, int weight) {
            super(power, weight);
            ElectricalNetworksUtils.getAllAppliances().add(this);
        }

        public int getDiagonally(){
            return diagonally;
        }

        public void setDiagonally(int diagonally) {
            this.diagonally = diagonally;
        }

        @Override
        public String toString() {
            return "Television {"+
                    "power = " + getPower() +
                    ", weight = " + getWeight() +
                    ", diagonally = " + diagonally +
                    '}';
        }
    }

