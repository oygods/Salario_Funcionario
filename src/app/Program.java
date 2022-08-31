package app;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();

        System.out.print("Gloss salary: ");
        funcionario.glossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + funcionario);
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println("Updated data: "+ funcionario);

    }
}
