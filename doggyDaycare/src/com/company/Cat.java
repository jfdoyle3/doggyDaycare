package com.company;

public class Cat extends Animal{
    public String pattern;
    public boolean isStray;
    public int killCount;

    public Cat(int legs, String size, boolean isFixed, String name, double weight, String pattern, boolean isStray, int killCount) {
        super(legs, size, isFixed, name, weight);

        this.pattern=pattern;
        this.isStray=this.isStray;
        this.killCount=killCount;
    }

    public void speak(){
        if(killCount>5)
            System.out.println("Hiss");
        else
            System.out.println("Mew");
    }
}
