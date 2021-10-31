package edu.vsu.ru;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x = readDouble("x", -1, 1);
        double e = readDouble("e", 0, 1);
        int n = readInt("n");

        writeSumN(calculateSumN(x, n));
        writeSum(calculateSum(x, e, n), "");
        writeSum(calculateSum(x, e / 10, n), "/10");
        writeLn(calculateLn(x));
    }

    static double readDouble(String name, int min, int max) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter data: ");
        System.out.print(name + " = ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Re-enter the data.");
            System.out.print(name + " = ");
            scanner.next();
        }

        double value = scanner.nextDouble();

        if (!((value > min) && ((max < min) || (value < max)))) {
            System.out.println("Invalid input. Re-enter the data.");
            value = readDouble(name, min, max);
        }

        return value;
    }

    static int readInt(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        System.out.print(name + " = ");

        while (!scanner.hasNextInt()) {
            System.out.println("Parameter entered incorrectly. Re-enter.");
            System.out.print(name + " = ");
            scanner.next();
        }

        int value = scanner.nextInt();

        if (value < 1) {
            System.out.println("Invalid input. Re-enter the " + name);
            value = readInt(name);
        }

        return value;
    }

    public static double next(double previous, int i, double x) {
        return previous * (i - 2) * x * x / i;
    }

    static double calculateSumN(double x, int n) {
        double previous = x;
        double sum = 0;

        for (int i = 3; i < 2 * n + 2; i += 2) {
            sum += previous;
            previous = next(previous, i, x);
        }

        return sum * 2;
    }

    static double calculateSum(double x, double e, int n) {
        double sum = 0;
        double previous = x;

        for (int i = 3; i <= 2 * n + 2; i += 2) {
            if (previous > e) {
                sum += previous;
            } else {
                return sum * 2;
            }
            previous = next(previous, i, x);
        }

        return sum * 2;
    }

    static double calculateLn(double x) {
        return Math.log((1 + x) / (1 - x));
    }

    static void writeSumN(double sumN) {
        System.out.println("The sum of n terms of a given form = " + sumN);
    }

    static void writeSum(double sumE, String e) {
        System.out.println("The sum of those terms that are greater in absolute value than e" + e + " = " + sumE);
    }

    static void writeLn(double SumLN) {
        System.out.println("Function value using Math method = " + SumLN);
    }
}
