package model;

import java.util.ArrayList;

public class ShowComm {
    

    public ArrayList<String> show(int choice){
  
        ArrayList<String> array = new ArrayList<>();
        
        if(choice == 1){
            Cat cat = new Cat();
            array = cat.getCommand();
        }
        if(choice == 2){
            Dog dog = new Dog();
            array = dog.getCommand();
        }
        if(choice == 3){
            Hamsters hamsters = new Hamsters();
            array = hamsters.getCommand();
        }
        if(choice == 4){
            Horse horse = new Horse();
            array = horse.getCommand();
        }
        if(choice == 5){
            Camel camel = new Camel();
            array = camel.getCommand();
        }
        if(choice == 6){
            Donkeys donkeys = new Donkeys();
            array = donkeys.getCommand();
        }
        return array;
    }
}
