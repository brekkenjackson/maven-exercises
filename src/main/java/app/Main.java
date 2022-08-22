package app;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter text here: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("You entered: ==> \"" + userInput + "\" <==");
        String numeric = StringUtils.isNumeric(userInput) ? "That's numeric!" : "That's not numeric!";
        System.out.println(numeric);
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
    }
}
