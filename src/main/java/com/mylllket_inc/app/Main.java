package com.mylllket_inc.app;

public class Main {
    public static void main(String[] args) {
        func(5, 10, 0.5);
    }

    public static void func(double a, double b, double h) {
        if (a >= b || h < 0)
            return;
        double step = a;
        double res = 0;
        System.out.printf("%-10s%-5s%n", "x", "f(x)");
        while (step <= b) {
            res = Math.tan(2 * step) - 3;
            System.out.printf("%-10.3f%.3f%n", step, res);
            step += h;
        }
    }
}
