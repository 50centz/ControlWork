package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {

    public int getChoice() throws InvalidInputException {
        int digit = getDigit();
        return digit;
    }

    public int getDigit() throws InvalidInputException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int degree = scanner.nextInt();
                if (degree < 0 && degree > 6) {
                    throw new InvalidInputException("");
                }
                return degree;
            } catch (InputMismatchException exception) {
                System.out.println("Error: Not a number is entered. Repeat the input.");
                scanner.next(); 
            } catch (InvalidInputException exception) {
                System.out.println("The degree must not be zero or negative. Repeat the input. ");
                scanner.next();
            }
        }
    }
}
