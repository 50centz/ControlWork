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

    public ArrayList<String> (){
        
        Model model = new Model();

        ArrayList<String> array = new ArrayList<>();

        array = model.showAnimal();
        return array;
    }
}
