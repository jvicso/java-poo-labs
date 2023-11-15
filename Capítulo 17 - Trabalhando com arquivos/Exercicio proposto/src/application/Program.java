package application;

import model.entities.Product;

import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sourceFileStr = sc.next();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";


        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Double price = Double.valueOf(fields[1]);
                Integer quantity = Integer.valueOf(fields[2]);

                products.add(new Product(name, price, quantity));

                line = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (Product product : products) {
                    bw.write(product.toString());
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED");

            } catch(IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }
}
