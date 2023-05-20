package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X:");
        double aX = sc.nextDouble();
        double bX = sc.nextDouble();
        double cX = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        double aY = sc.nextDouble();
        double bY = sc.nextDouble();
        double cY = sc.nextDouble();

        double p = (aX + bX + cX) / 2;
        double areaX = Math.sqrt(p * (p - aX) * (p-bX) * (p-cX));
        p = (aY + bY + cY) / 2;
        double areaY = Math.sqrt(p * (p - aY) * (p-bY) * (p-cY));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");

        }

        sc.close();
    }

}
