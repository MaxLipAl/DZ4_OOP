import java.util.List;

public class Division {
    // Метод для выполнения операции деления
    public static double divide(List<Double> numbers) {
        // Инициализируем результат значением первого числа в списке
        double result = numbers.get(0);
        // Делим остальные числа на результат
        for (int i = 1; i < numbers.size(); i++) {
            // Проверка деления на ноль
            if (numbers.get(i) == 0) {
                throw new ArithmeticException("Деление на ноль");
            }
            result = result / numbers.get(i);
        }
        return result;
    }
}
