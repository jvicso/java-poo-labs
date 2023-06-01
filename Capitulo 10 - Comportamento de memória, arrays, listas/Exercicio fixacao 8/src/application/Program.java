package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        int somaPares = 0, contadorPares = 0;
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                contadorPares++;
            }
        }


        if(contadorPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double media = (double) somaPares / contadorPares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", media);
        }




        sc.close();
    }
}
