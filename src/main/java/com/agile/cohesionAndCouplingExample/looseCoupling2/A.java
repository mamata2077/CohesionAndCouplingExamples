package com.agile.cohesionAndCouplingExample.looseCoupling2;

class A {
    Show s;
    public A(Show s) {
         this.s = s;
    }
    public void display() {
         System.out.println("A");
         s.display();
     }
}