package com.factory;

public class Factorycreatinginstanceforsubclasses {
    public Bike getmodel(String modeltype){
        if (modeltype.equalsIgnoreCase("hero")){
            return new Hero();
        }
        else if(modeltype.equalsIgnoreCase("yamaha")){
            return  new Yamaha();
        }
        else {
            return null;
        }
    }
}
