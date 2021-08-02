package com.company;

// Separate classes for each car with so little data would be unnecessary

// Mitsubishi
 class Mitsubishi extends Car {
     public Mitsubishi(int cylinders, String name) {
         super(cylinders, name);
     }

     @Override
     public String startEngine() {
         return(super.getName() + " engine is starting");
     }

     @Override
     public String accelerate() {
         return(super.getName() +" is accelerating");
     }

     @Override
     public String brake() {
         return(super.getName() +" is braking");
     }
 }

// Holden
class Holden extends Car {
     public Holden(int cylinders, String name) {
         super(cylinders, name);
     }

     @Override
     public String startEngine() {
         return(super.getName() + " engine is starting");
     }

     @Override
     public String accelerate() {
         return(super.getName() +" is accelerating");
     }

     @Override
     public String brake() {
         return(super.getName() +" is braking");
     }
 }

// Ford
class Ford extends Car {
     public Ford(int cylinders, String name) {
         super(cylinders, name);
     }

     @Override
     public String startEngine() {
         return(super.getName() + " engine is starting");
     }

     @Override
     public String accelerate() {
         return(super.getName() +" is accelerating");
     }

     @Override
     public String brake() {
         return(super.getName() +" is braking");
     }
 }
