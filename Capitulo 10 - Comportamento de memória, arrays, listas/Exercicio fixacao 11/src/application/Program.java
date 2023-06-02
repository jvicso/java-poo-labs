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
        for(int i = 0; i < vect.length; i++) {
            System.out.printf("Altura da %da pessoa: ", i+1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i+1);
            char sexo = sc.next().charAt(0);
            vect[i] = new Pessoa(altura, sexo);
        }

        double menorAltura = vect[0].getAltura();
        double maiorAltura = vect[0].getAltura();

        for(int i = 0; i < vect.length; i++) {
            if(vect[i].getAltura() < menorAltura) {
                menorAltura = vect[i].getAltura();
            }
            if(vect[i].getAltura() > maiorAltura) {
                maiorAltura = vect[i].getAltura();
            }
        }

        int qtdMulheres = 0, qtdHomens = 0;
        double totalAlturaMulheres = 0;
        for(int i = 0; i < vect.length; i++) {
            if(vect[i].getSexo() == 'M') {
                qtdHomens++;

            }
            else {
                qtdMulheres++;
                totalAlturaMulheres += vect[i].getAltura();
            }
        }

        double mediaAlturaMulheres = totalAlturaMulheres / qtdMulheres;

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
        System.out.printf("Numero de homens = %d%n", qtdHomens);

        sc.close();
    }
}
