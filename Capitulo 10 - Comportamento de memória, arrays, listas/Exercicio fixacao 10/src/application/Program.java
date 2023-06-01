package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        Aluno[] vect = new Aluno[n];
        for(int i = 0; i < vect.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i+1);
            sc.nextLine();
            String nome = sc.nextLine();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            vect[i] = new Aluno(nome, n1, n2);
        }

        System.out.println("Alunos aprovados:");
        double[] medias = new double[n];
        for(int i = 0; i < vect.length; i++) {
            medias[i] = (vect[i].getN1() + vect[i].getN2()) / 2;
            if(medias[i] >= 6.0) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}
