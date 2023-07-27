package view;




public class Start {
    
    Number number = new Number();
    public void start() throws InvalidInputException{

        boolean start = true;

        while(start){
            View view = new View();
            view.start();

            int choice = number.getChoice();
            

            if(choice == 1){
                CreateAnimal createAnimal = new CreateAnimal();
                createAnimal.start();
            }
            if(choice == 2){
                ListCommand listCommand = new ListCommand();
                listCommand.showCommand();
            }
            if(choice == 3){
                AddCommand addCommand = new AddCommand();
                addCommand.add();
            }
            if(choice == 4){
                start = false;
            }
        }
    }
}
