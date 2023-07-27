package model;

import java.util.ArrayList;

public class Model { 

    public ArrayList<String> view(){

        Command command = new Command();
        ArrayList<String> array = new ArrayList<>();

        array = command.showCommand();
        return array;
    }
    
    public void createAnimal(int choice){
        CreateAnimal createAnimal = new CreateAnimal();
        createAnimal.create(choice);
        
    }

    public ArrayList<String> showCommand(int choice){

        ShowComm showComm = new ShowComm();
        ArrayList<String> array = new ArrayList<>();

        array = showComm.show(choice);
        return array;
    }

    public void addCommand(int choice, String command){
        AddCommand addCommand = new AddCommand();
        addCommand.addCommand(choice, command);
    }
}
