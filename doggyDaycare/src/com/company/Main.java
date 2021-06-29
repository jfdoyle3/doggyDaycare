package com.company;

public class Main {

    public static void main(String[] args) {
	  Animal frog=new Animal(4,"small",false, "Raul",2);
	  Animal cat=new Cat(4,"Extra Large",true,"Henry",12,"Calico",true,1);
	  Animal dog=new Dog(2,"medium",true,"Benji",27.7,"Bulldog","short","B34");

	  frog.speak();
	  dog.speak();
	  cat.speak();
    }
}
