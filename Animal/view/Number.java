package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {

    public int getChoice()  {
        int digit = getDigit();
        return digit;
    }

    public int getDigit()  {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int degree = scanner.nextInt();    
                return degree;
            } catch (InputMismatchException exception) {
                System.out.println("Error: Not a number is entered. Repeat the input.");
                scanner.next(); 
            } 
        }
    }
}
