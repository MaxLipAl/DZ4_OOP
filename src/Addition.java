
import java.util.List;

public class Addition {
    // Метод для выполнения операции сложения
    public static double add(List<Double> numbers) {
        double result = 0;
        // Проходим по всем числам в списке и суммируем их
        for (Double num : numbers) {
            result += num;
        }
        return result;
    }
}