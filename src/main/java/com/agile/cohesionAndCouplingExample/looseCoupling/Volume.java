package com.agile.cohesionAndCouplingExample.looseCoupling;

public class Volume {
    public static void main(String args[]){
        Box b = new Box(5,5,5);
        System.out.println("Volume = "+ b.getVolume());
    }
}