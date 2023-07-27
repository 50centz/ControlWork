package view;

import presenter.Presenter;
import java.util.ArrayList;
import java.util.Scanner;

public class ListCommand {
    

    public void showCommand(){
        System.out.println("");
        System.out.println("Teams of which animal do you want to watch ?\n1. Cat\n2. Dog\n3. Hamsters\n4. Horse\n5. Camel\n6. Donkeys");
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        Presenter presenter = new Presenter();

        ArrayList<String> array = new ArrayList<>();

        array = presenter.showCommand(choice);

        ShowCommand showCommand = new ShowCommand();
        showCommand.show(array);
        System.out.println("");
    }
}

    

