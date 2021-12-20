package com.factory;

public class Solution {
    public static void main(String[] args) {
    /*    Bike bike = new Hero();
        bike.model();*/
        Factorycreatinginstanceforsubclasses factorycreatinginstanceforsubclasses =new Factorycreatinginstanceforsubclasses();
      Bike b=  factorycreatinginstanceforsubclasses.getmodel("hero");

      System.out.println(b.getClass());
      b.model();
    }
}
