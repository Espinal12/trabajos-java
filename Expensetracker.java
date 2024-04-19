import java.util.ArrayList;
import java.util.Scanner;

public class Expensetracker {
    private static class Expense {
        String description;
        double amount;

        Expense(String description, double amount) {
            this.description = description;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Descripción: " + description + ", Monto: $" + String.format("%.2f", amount);
        }

        public double getAmount() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getAmount'");
        }
    }

    public static void main(String[] args) {
        ArrayList<Expense> expenses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n1. Agregar un gasto");
            System.out.println("2. Mostrar todos los gastos");
            System.out.println("3. Calcular gastos totales");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción (1-4): ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Ingrese la descripción del gasto: ");
                    String description = scanner.nextLine();
                    System.out.print("Ingrese el monto del gasto: ");
                    String amountStr = scanner.nextLine();
                    try {
                        double amount = Double.parseDouble(amountStr.replace(',', '.'));
                        expenses.add(new Expense(description, amount));
                        System.out.println("Gasto agregado exitosamente.");
                    } catch (NumberFormatException e) {
                        System.out.println("Error: El monto ingresado no es un número válido.");
                    }
                    break;
                case 2:
                    if (expenses.isEmpty()) {
                        System.out.println("No hay gastos registrados.");
                    } else {
                        System.out.println("\nLista de Gastos:");
                        for (Expense expense : expenses) {
                            System.out.println(expense);
                        }
                    }
                    break;
                case 3:
                    double total = 0;
                    for (Expense expense : expenses) {
                        total += expense.getAmount();
                    }
                    System.out.printf("Gastos totales: $%.2f\n", total);
                    break;
                case 4:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor ingrese un número entre 1 y 4.");
            }
        } while (option != 4);
        scanner.close();
    }
}
