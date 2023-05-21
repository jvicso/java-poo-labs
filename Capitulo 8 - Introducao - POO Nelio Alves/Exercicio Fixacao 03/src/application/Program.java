package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.name = sc.nextLine();
        s.g1 = sc.nextDouble();
        s.g2 = sc.nextDouble();
        s.g3 = sc.nextDouble();
        System.out.printf("FINAL GRADE = %.2f%n", s.finalGrade());
        if(s.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS",s.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();

    }
}
