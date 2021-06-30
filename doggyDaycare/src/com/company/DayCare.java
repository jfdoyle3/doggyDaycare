package com.company;

import java.util.ArrayList;
import java.util.List;

public class DayCare {

    List<Animal> animals=new ArrayList<>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void displayAnimals(){
        for(Animal animal : animals)
            System.out.printf("Name: %s\nLegs: %d\nWeight: %f lbs\n",animal.name,animal.legs,animal.weight);
    }

    public void removeAnimal( String name){
        animals.removeIf(animal -> animal.name.equals(name));
    }
}
