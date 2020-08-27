package com.agile.cohesionAndCouplingExample.looseCoupling;

final class Box {
 private int volume;
 Box(int length, int width, int height){
    this.volume = length * width * height;
}

public int getVolume(){
    return volume;
}
}