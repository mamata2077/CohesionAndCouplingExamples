package com.agile.cohesionAndCouplingExample.tightCoupling;

public class Box {
    public int volume;
    Box(int length, int width, int height){
        this.volume = length * width * height;
    }
}