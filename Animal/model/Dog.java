package model;

import java.util.ArrayList;

public class Dog extends Animal{

    public static ArrayList<String> array = new ArrayList<>();

    public Dog(){
        
    }

    public void showCommand(){

        String attack = "Attack";
        String sitDown = "Sit down";
        String go = "Go";

        this.array.add(attack);
        this.array.add(sitDown);
        this.array.add(go);
    }

    public  ArrayList<String> getCommand(){
        return array;
    }

    public void addCommand(String command){
        this.array.add(command);
    }
}
