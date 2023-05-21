package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.println("Enter the product data:");
        System.out.print("Name: ");
        p.name = sc.nextLine();
        System.out.print("Price: ");
        p.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        p.quantity = sc.nextInt();
        System.out.printf("\nProduct data: " + p);

        System.out.print("\nEnter the number of products to be added in stock: ");
        p.addProducts(sc.nextInt());
        System.out.print("\nUpdated data: " + p) ;

        System.out.print("\nEnter the number of products to be removed from stock: ");
        p.removeProducts(sc.nextInt());
        System.out.printf("\nUpdated data: " + p);

        sc.close();
    }
}
