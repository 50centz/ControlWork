package model;
import java.util.ArrayList;

public class Hamsters extends Animal {

    public static ArrayList<String> array = new ArrayList<>();

    public Hamsters(){
        
    }

    public void showCommand(){

        String sleep = "Sleep";
        String toEat = "To eat";
 
        this.array.add(sleep);
        this.array.add(toEat);
    }

    public  ArrayList<String> getCommand(){
        return array;
    }

    public void addCommand(String command){
        this.array.add(command);
    }
}
