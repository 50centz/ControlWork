import model.Camel;
import model.Cat;
import model.Dog;
import model.Donkeys;
import model.Hamsters;
import model.Horse;
import view.Start;

public class Main {
  
    public static void main(String[] args) throws Exception {

        Cat cat = new Cat();
        cat.showCommand();

        Dog dog = new Dog();
        dog.showCommand();

        Hamsters hamsters = new Hamsters();
        hamsters.showCommand();

        Horse horse = new Horse();
        horse.showCommand();

        Camel camel = new Camel();
        camel.showCommand();

        Donkeys donkeys = new Donkeys();
        donkeys.showCommand();
        
        Start start = new Start();
        start.start();
    }    
}
