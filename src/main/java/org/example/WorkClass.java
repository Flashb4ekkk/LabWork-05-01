package org.example;

import java.util.Scanner;

public class WorkClass {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.print("s = ");
        double s = skan.nextDouble();
        System.out.print("t = ");
        double t = skan.nextDouble();

        double c = (g(1, s) + Math.pow(1 + Math.pow(g(t, 1), 2), 2)) /
                (1 + Math.pow(g(s + t, 1), 3));

        System.out.println("c = " + c);
    }

    public static double g(final double a, final double b) {
        return Math.pow(a, 2) + a * b + Math.pow(b, 2);
    }
}