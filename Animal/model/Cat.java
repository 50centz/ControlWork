package model;
import java.util.ArrayList;
/**
 * Cat
 */
public class Cat extends Animal{

    public static ArrayList<String> array = new ArrayList<>();

    public Cat(){
        
    }

    public void showCommand(){

        String purr = "Purr";
        String sitDown = "Sit down";
        String go = "Go";
    
        this.array.add(purr);
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