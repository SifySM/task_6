package edu.vsu.ru;

public class CTask_6 {
    static CMinMaxDoubleParameter x = new CMinMaxDoubleParameter("x", -1, 1);
    static CMinMaxDoubleParameter e = new CMinMaxDoubleParameter("e", 0, 1);
    static CIntParameter n = new CIntParameter("n");

    public static double next(double previous, int i) {
        double x = CTask_6.x.getValue();
        return previous * (i - 2) * x * x / i;
    }

    public static double calculateSumN() {
        int n = CTask_6.n.getValue();
        double previous = CTask_6.x.getValue();
        double sum = 0;

        for (int i = 3; i < 2 * n + 2; i += 2) {
            sum += previous;
            previous = next(previous, i);
        }

        return sum * 2;
    }

    public static double calculateSum(double e) {
        double sum = 0;
        double previous = CTask_6.x.getValue();
        double n = CTask_6.n.getValue();

        for (int i = 3; i <= 2 * n + 2; i += 2) {
            if (previous > e) {
                sum += previous;
            } else {
                return sum * 2;
            }
            previous = next(previous, i);
        }

        return sum * 2;
    }

    public static double calculateLn() {
        double x = CTask_6.x.getValue();

        return Math.log((1 + x) / (1 - x));
    }

}
