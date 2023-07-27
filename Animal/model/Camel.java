package model;
import java.util.ArrayList;

public class Camel extends Animal{
    
    public static ArrayList<String> array = new ArrayList<>();
    
    public Camel(){
    
    }

    public void showCommand(){

        String standUp = "Stand up";
        String sitDown = "Sit down";
        String go = "Go";
        String toStand = "To stand";

        this.array.add(standUp);
        this.array.add(sitDown);
        this.array.add(go);
        this.array.add(toStand);
    }

    public  ArrayList<String> getCommand(){
        return array;
    }

    public void addCommand(String command){
        this.array.add(command);
    }
}
