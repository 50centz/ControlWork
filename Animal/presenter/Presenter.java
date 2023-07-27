package presenter;

import java.util.ArrayList;

import model.Model;

public class Presenter {
   
    public ArrayList<String> view(){
        
        Model model = new Model();

        ArrayList<String> array = new ArrayList<>();

        array = model.view();
        return array;
    }

    public void createAnimal(int choice){
        
        Model model = new Model();

        model.createAnimal(choice);
    }

    public ArrayList<String> showCommand(int choice){
        
        Model model = new Model();
        ArrayList<String> array = new ArrayList<>();

        array = model.showCommand(choice);
        return array;
    }

    public void addCommand(int choice, String command){
        Model model = new Model();
        model.addCommand(choice, command);
    }
}
