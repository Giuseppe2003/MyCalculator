package org.example;

import java.util.Scanner;
import org.example.operations.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nScegli un'operazione (addizione, sottrazione, moltiplicazione, divisione, potenza) o digita 0 per uscire:");
            String operation = scanner.nextLine().toLowerCase();

            if (operation.equals("0")) {
                System.out.println("Uscita dal programma. Arrivederci!");
                break;
            }

            System.out.println("Inserisci il primo numero:");
            double num1 = scanner.nextDouble();

            System.out.println("Inserisci il secondo numero:");
            double num2 = scanner.nextDouble();

            // Consuma il newline rimasto dal nextDouble
            scanner.nextLine();

            double result;

            switch (operation) {
                case "addizione":
                    result = Addition.add(num1, num2);
                    System.out.println("Risultato: " + result);
                    break;
                case "sottrazione":
                    result = Subtraction.subtract(num1, num2);
                    System.out.println("Risultato: " + result);
                    break;
                case "moltiplicazione":
                    result = Multiplication.multiply(num1, num2);
                    System.out.println("Risultato: " + result);
                    break;
                case "divisione":
                    try {
                        result = Division.divide(num1, num2);
                        System.out.println("Risultato: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;
                case "potenza":
                    result = Power.power(num1, num2);
                    System.out.println("Risultato: " + result);
                    break;
                default:
                    System.out.println("Operazione non valida!");
            }
        }

        scanner.close();
    }
}
