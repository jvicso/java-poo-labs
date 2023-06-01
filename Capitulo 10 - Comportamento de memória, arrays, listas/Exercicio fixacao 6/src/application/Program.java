package application;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        System.out.println("Digite os valores do vetor A:");
        int[] vetorA = new int[n];
        for(int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        int[] vetorB = new int[n];
        for(int i = 0; i < vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        int[] vetorResultante = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println(vetorResultante[i] = vetorA[i] + vetorB[i]);
        }

        sc.close();
    }
}
