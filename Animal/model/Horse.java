package model;
import java.util.ArrayList;

public class Horse extends Animal {

    public static ArrayList<String> array = new ArrayList<>();
    
    public Horse(){
       
    }

    public void showCommand(){

        String standUp = "Stand up";
        String sitDown = "Sit down";
        String go = "Go";
        String toStand = "To stand";
        String gallop = "Gallop";

        this.array.add(standUp);
        this.array.add(sitDown);
        this.array.add(go);
        this.array.add(toStand);
        this.array.add(gallop);
    }

    public  ArrayList<String> getCommand(){
        return array;
    }

    public void addCommand(String command){
        this.array.add(command);
    }
}
