public class BinaryConversion {
    // Метод для конвертации числа из десятичной системы в двоичную
    public static String decimalToBinary(double decimalNumber) throws IllegalArgumentException {
        if (decimalNumber < 0) {
            throw new IllegalArgumentException("Отрицательные числа не поддерживаются");
        }

        StringBuilder binary = new StringBuilder();
        int integerPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - integerPart;

        // Преобразование целой части
        while (integerPart > 0) {
            binary.insert(0, integerPart % 2);
            integerPart /= 2;
        }

        // Добавление разделителя
        if (fractionalPart > 0) {
            binary.append('.');
        }

        // Преобразование дробной части
        while (fractionalPart > 0) {
            fractionalPart *= 2;
            if (fractionalPart >= 1) {
                binary.append(1);
                fractionalPart -= 1;
            } else {
                binary.append(0);
            }
        }

        return binary.toString();
    }

    // Метод для конвертации числа из двоичной системы в десятичную
    public static double binaryToDecimal(String binaryNumber) {
        String[] parts = binaryNumber.split("\\.");
        int integerPart = Integer.parseInt(parts[0], 2);

        double result = integerPart;

        if (parts.length == 2) {
            double fractionalPart = Double.parseDouble("0." + parts[1]);
            for (int i = 0; i < parts[1].length(); i++) {
                fractionalPart /= 2;
            }
            result += fractionalPart;
        }

        return result;
    }
}
