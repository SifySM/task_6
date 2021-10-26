package edu.vsu.ru;

import java.util.Scanner;

public class CMinMaxDoubleParameter {
    double value;
    String name;
    double min;
    double max;

    public CMinMaxDoubleParameter(String name, double min, double max) {
        this.name = name;
        this.min = min;
        this.max = max;
        readDouble();
    }

    public void readDouble() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter data: ");
        System.out.print(name + " = ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Re-enter the data.");
            System.out.print(name + " = ");
            scanner.next();
        }

        value = scanner.nextDouble();

        if (!((value > min) && ((max < min) || (value < max)))) {
            System.out.println("Invalid input. Re-enter the data.");
            readDouble();
        }

    }

    public double getValue() {
        return value;
    }
}
