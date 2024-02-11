import java.util.List;

public class Multiplication {
    // Метод для выполнения операции умножения
    public static double multiply(List<Double> numbers) {
        // Инициализируем результат значением 1 (произведение)
        double result = 1;
        // Умножаем все числа из списка
        for (Double num : numbers) {
            result = result * num;
        }
        return result;
    }
}
