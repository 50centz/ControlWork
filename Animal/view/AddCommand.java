package view;

import presenter.Presenter;
import java.util.Scanner;
import java.util.ArrayList;

public class AddCommand {
    
    public void add(){
        Scanner scanner = new Scanner(System.in);
        String command = "";
        System.out.println("");
        System.out.println("Which animal do you want to add a team to ?\n1. Cat\n2. Dog\n3. Hamsters\n4. Horse\n5. Camel\n6. Donkeys");

        int choice = scanner.nextInt();
        
        System.out.println("What will the team be called ?");
        
        command = scanner.next();

        Presenter presenter = new Presenter();

        presenter.addCommand(choice, command);

        
    }
}
