package view;

import java.util.Scanner;

import presenter.Presenter;
/**
 * CreateAnimal
 */
public class CreateAnimal {

    public void start(){
        System.out.println("What kind of animal do you want to create ?");
        System.out.println("1. Cat\n2. Dog\n3. Hamsters\n4. Horse\n5. Camel\n6. Donkeys");

        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        boolean start = true;

        while(start){
            choice = scanner.nextInt();
            if (choice > 0 && choice < 7){
                start = false;
            }
        }

        Presenter presenter = new Presenter();
        presenter.createAnimal(choice);
        //scanner.close();

    }
}