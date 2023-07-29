package view;

import presenter.Presenter;
import java.util.ArrayList;
import java.util.Scanner;

public class ListCommand {
    Number number = new Number();

    public void showCommand() {
        System.out.println("");
        System.out.println("Teams of which animal do you want to watch ?\n1. Cat\n2. Dog\n3. Hamsters\n4. Horse\n5. Camel\n6. Donkeys");


        int choice = 0;
        boolean start = true;

        while (start) {
            choice = number.getChoice();
            if (choice > 0 && choice < 7) {
                start = false;
            } else {
                System.out.println("The number must not be less than 1 and greater than 6");
            }
        }

        Presenter presenter = new Presenter();

        ArrayList<String> array = new ArrayList<>();

        array = presenter.showCommand(choice);

        ShowCommand showCommand = new ShowCommand();
        showCommand.show(array);
        System.out.println("");
    }
}
