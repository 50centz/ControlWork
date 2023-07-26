package view;

import java.util.Scanner;


public class Start {
    
    Scanner scanner = new Scanner(System.in);

    public void start(){

        boolean start = true;

        while(start){
            View view = new View();
            view.start();

            int choice = scanner.nextInt();

            if(choice == 1){
                CreateAnimal createAnimal = new CreateAnimal();
                createAnimal.start();
            }
            if(choice == 2){

            }
            if(choice == 3){

            }
            if(choice == 4){
                start = false;
            }
        }
    }
}
