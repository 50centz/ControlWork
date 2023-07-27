package model;

public class CreateAnimal {
    
    public void create(int choice){
        Counter counter = new Counter();
        counter.plus();
        
        if(choice == 1){
            Cat cat = new Cat();
        }
        if(choice == 2){
            Dog dog = new Dog();
        }
        if(choice == 3){
            Hamsters hamsters = new Hamsters();
        }
        if(choice == 4){
            Horse horse = new Horse();
        }
        if(choice == 5){
            Camel camel = new Camel();
        }
        if(choice == 6){
            Donkeys donkeys = new Donkeys();
        }
    }
}
