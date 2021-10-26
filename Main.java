package edu.vsu.ru;

public class Main {
    public static void main(String[] args) {
        double SumN = CTask_6.calculateSumN();
        System.out.println("The sum of n terms of a given form = " + SumN);

        double SumE = CTask_6.calculateSum(CTask_6.e.getValue());
        System.out.println("The sum of those terms that are greater in absolute value than e = " + SumE);

        SumE = CTask_6.calculateSum(CTask_6.e.getValue() / 10);
        System.out.println("The sum of those terms that are greater in absolute value than e/10 = " + SumE);

        double SumLN = CTask_6.calculateLn();
        System.out.println("Function value using Math method = " + SumLN);
    }
}