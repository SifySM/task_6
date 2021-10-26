package edu.vsu.ru;

import java.util.Scanner;

public class CIntParameter {
    int value;
    String name;

    public CIntParameter(String name) {
        this.name = name;
        readValue();
    }

    public void readValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        System.out.print(name + " = ");

        while (!scanner.hasNextInt()) {
            System.out.println("Parameter entered incorrectly. Re-enter.");
            System.out.print(name + " = ");
            scanner.next();
        }

        value = scanner.nextInt();

        if (value < 1) {
            System.out.println("Invalid input. Re-enter the " + name);
            readValue();
        }

    }

    public int getValue() {
        return value;
    }

}

