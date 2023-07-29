package view;

import java.util.Scanner;

import presenter.Presenter;
/**
 * CreateAnimal
 */
public class CreateAnimal {

    Number number = new Number();

    public void start(){
        System.out.println("What kind of animal do you want to create ?");
        System.out.println("1. Cat\n2. Dog\n3. Hamsters\n4. Horse\n5. Camel\n6. Donkeys");

        int choice = 0;
        boolean start = true;

        while(start){
            choice = number.getChoice();
            if (choice > 0 && choice < 7){
                start = false;
            }else{
                System.out.println("The number must not be less than 1 and greater than 6");
            }
        }

        Presenter presenter = new Presenter();
        presenter.createAnimal(choice);
        //scanner.close();

    }
}