import java.util.List;

public class Subtraction {
    // Метод для выполнения операции вычитания
    public static double subtract(List<Double> numbers) {
        // Инициализируем результат значением первого числа в списке
        double result = numbers.get(0);
        // Вычитаем остальные числа из результата
        for (int i = 1; i < numbers.size(); i++) {
            result = result - numbers.get(i);
        }
        return result;
    }
}