import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание списка чисел для вычислений
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 56.0));

        boolean exit = false;
        while (!exit) {
            // Вывод меню
            System.out.println("Меню:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Бинарное вычисление");
            System.out.println("6. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Вызов метода сложения и вывод результата
                    System.out.println("Результат сложения: " + Addition.add(numbers));
                    break;
                case 2:
                    // Вызов метода вычитания и вывод результата
                    System.out.println("Результат вычитания: " + Subtraction.subtract(numbers));
                    break;
                case 3:
                    // Вызов метода умножения и вывод результата
                    System.out.println("Результат умножения: " + Multiplication.multiply(numbers));
                    break;
                case 4:
                    // Вызов метода деления и вывод результата
                    System.out.println("Результат деления: " + Division.divide(numbers));
                    break;
                case 5:
                    // Переход к меню для бинарных операций
                    binaryMenu(scanner);
                    break;
                case 6:
                    // Выход из программы
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте снова.");
            }
        }

        scanner.close();
    }

    // Метод для отображения меню бинарных операций
    private static void binaryMenu(Scanner scanner) {
        boolean backToMainMenu = false;
        while (!backToMainMenu) {
            // Вывод меню бинарных операций
            System.out.println("Бинарное вычисление:");
            System.out.println("1. Перевод числа из десятичной в двоичную");
            System.out.println("2. Перевод числа из двоичной в десятичную");
            System.out.println("3. Назад");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Вызов метода для перевода из десятичной в двоичную систему
                    convertDecimalToBinary(scanner);
                    break;
                case 2:
                    // Вызов метода для перевода из двоичной в десятичную систему
                    convertBinaryToDecimal(scanner);
                    break;
                case 3:
                    // Возврат в основное меню
                    backToMainMenu = true;
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте снова.");
            }
        }
    }

    // Метод для перевода числа из десятичной в двоичную систему
    private static void convertDecimalToBinary(Scanner scanner) {
        System.out.println("Введите число для перевода из десятичной в двоичную:");
        double decimalNumber = scanner.nextDouble();
        // Вызов метода и вывод результата
        String binaryRepresentation = BinaryConversion.decimalToBinary(decimalNumber);
        System.out.println("Бинарное представление числа " + decimalNumber + ": " + binaryRepresentation);
    }

    // Метод для перевода числа из двоичной в десятичную систему
    private static void convertBinaryToDecimal(Scanner scanner) {
        System.out.println("Введите число для перевода из двоичной в десятичную:");
        String binaryNumber = scanner.next();
        // Вызов метода и вывод результата
        double decimalValue = BinaryConversion.binaryToDecimal(binaryNumber);
        System.out.println("Десятичное представление числа " + binaryNumber + ": " + decimalValue);
    }
}