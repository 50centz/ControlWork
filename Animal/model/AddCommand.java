package model;

public class AddCommand {
    
    

    public void addCommand(int choice, String command){

        if(choice == 1){
            Cat cat = new Cat();
            cat.addCommand(command);
        }
        if(choice == 2){
            Dog dog = new Dog();
            dog.addCommand(command);
        }
        if(choice == 3){
            Hamsters hamsters = new Hamsters();
            hamsters.addCommand(command);
        }
        if(choice == 4){
            Horse horse = new Horse();
            horse.addCommand(command);
        }
        if(choice == 5){
            Camel camel = new Camel();
            camel.addCommand(command);
        }
        if(choice == 6){
            Donkeys donkeys = new Donkeys();
            donkeys.addCommand(command);
        }
    }
}
