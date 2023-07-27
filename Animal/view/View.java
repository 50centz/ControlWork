package view;

import java.util.ArrayList;

import presenter.Presenter;

public class View {
    
    public void start(){
        Presenter presenter = new Presenter();

        ArrayList<String> array = new ArrayList<>();

        array = presenter.view();

        ShowCommand showCommand = new ShowCommand();
        showCommand.show(array);
    }

    
}
