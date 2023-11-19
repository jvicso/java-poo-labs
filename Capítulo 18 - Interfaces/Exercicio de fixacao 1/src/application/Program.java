package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        int installments = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);

        System.out.println("Parcelas:");
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installments);

        for(Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();

    }
}
