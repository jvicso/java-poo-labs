package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %d pessoa%n", i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(nome, idade, altura);
        }

        double soma = 0;
        int idadeMenor16 = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getAltura();
            if(vect[i].getIdade() < 16) {
                idadeMenor16++;
            }
        }

        double media = soma / vect.length;
        System.out.printf("\nAltura média: %.2f%n", media);

        media = (double) idadeMenor16 / vect.length * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", media);
        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}
