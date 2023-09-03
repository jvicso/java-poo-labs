package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for(int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa:%n", i+1);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            vect[i] = new Pessoa(nome, idade);
        }

        int maisVelho = vect[0].getIdade();
        int posicao = 0;
        for(int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() > maisVelho) {
                maisVelho = vect[i].getIdade();
                posicao = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", vect[posicao].getNome());

        sc.close();
    }
}
