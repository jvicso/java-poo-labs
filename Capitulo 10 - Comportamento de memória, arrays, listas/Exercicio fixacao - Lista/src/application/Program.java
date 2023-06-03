package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        Integer id = null;
        List<Employee> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            System.out.printf("\nEmployee #%d:%n", i + 1);
            System.out.print("Id: ");
            id = sc.nextInt();
            while (getListEmployeeFiltered(list, id) != null) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        id = sc.nextInt();

        if(getListEmployeeFiltered(list, id) != null) {
            System.out.print("Enter the percentage: ");
            getListEmployeeFiltered(list, id).increaseSalary(sc.nextDouble());
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees:");
        for(Employee emp : list) {
            System.out.println(emp);
        }
        sc.close();
    }

    public static Employee getListEmployeeFiltered(List<Employee> list, int id) {
        return list.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst().orElse(null);
    }
}
