package com.agile.cohesionAndCouplingExample.tightCoupling2;

class A {
    B b;
    public A() {
          b = new B();
    }
    public void display() {
          System.out.println("A");
          b.display();
    }
}