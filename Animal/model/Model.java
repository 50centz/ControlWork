package model;

import java.util.ArrayList;

public class Model { 

    public ArrayList<String> view(){

        Command command = new Command();
        ArrayList<String> array = new ArrayList<>();

        array = command.showCommand();
        return array;
    }  
}
