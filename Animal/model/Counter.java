package model;

public class Counter {
    private static int number = 0;

    public void plus(){
        this.number++;
    }

    public int showCount(){
        return number;
    }
}
