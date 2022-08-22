package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public void delete() {
        this.scanner.nextLine();
    }

    public String getString() {
        System.out.println("My string here");
        return this.scanner.nextLine();
    }

    public String getString(String arg) {
        System.out.println(arg);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("y or n?");
        String input = this.scanner.nextLine();
        switch (input) {
            case ("no"):
            case ("n"):
            case ("nope"):
            case ("nah"):
                return false;
            case ("yes"):
            case ("y"):
            case ("sure"):
            case ("yep"):
                return true;
            case ("maybe"):
                System.out.println("Try again >:O");
                return yesNo();
            default:
                return yesNo();
        }
    }

    public int getInt() {
        String userInput = getString("Enter an integer:");
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return getInt();
        }
    }

    public double getDouble() {
        try {
            double userInput = Double.parseDouble(getString("Input number is:"));
            System.out.println("That's valid");
            return userInput;
        } catch (NumberFormatException e) {
            System.out.println("This is NOT double! Come back later...");
            return getDouble();
        }
    }

    public int getSecretInt(int min, int max) {
        int input;
        do {
            System.out.println("Enter a number between " + min + " and " + (max - 1) + ".");
            input = this.scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }

}
