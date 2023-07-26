package model;

import java.util.ArrayList;

public class Command {
    
    public ArrayList<String> showCommand(){

        ArrayList<String> array = new ArrayList<>();

        String createAnimal = "1. Create a new Animal";
        String list = "2. List of commands that the animal performs";
        String newCommand = "3. Train an animal in new commands";
        String exit = "4. Exit program";
        array.add(createAnimal);
        array.add(list);
        array.add(newCommand);
        array.add(exit);

        return array;
    }   
}
