package view;
import java.util.ArrayList;


public class ShowCommand {
    
    public void show( ArrayList<String> array){
        for (String string : array) {
            System.out.println(string);
        }
    }
}
