package com.agile.cohesionAndCouplingExample.looseCoupling2;


import java.io.IOException;
 
public class LooseCoupling {
      public static void main(String args[]) throws IOException {
           Show b = new B();
           Show c = new C();
           A a = new A(b);
           a.display();
           A a1 = new A(c);
           a1.display();
      }
}
 

 


 
