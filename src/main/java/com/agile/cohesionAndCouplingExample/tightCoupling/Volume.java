package com.agile.cohesionAndCouplingExample.tightCoupling;

//Here Volume class knows much about Box class and is directly accessing its data
public class Volume {
    public static void main(String args[]){
        Box b = new Box(5,5,5);
     
        System.out.println("Volume = "+ b.volume);
    }
}