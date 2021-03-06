package exercises.arrays;

/**
 * 6.1. Четное или нечетное количество отрицательных значений
 * Метод принимает массив целочисленных значений.
 * При этом массив может содержать как положительные значения, так и отрицательные,
 * но не может содержать 0.
 * Необходимо реализовать метод таким образом, чтобы он вернул булево значение следующим образом:
 * 1. true - количество отрицательных значений в массиве нечетное число;
 * 2. false - количество положительных значений в массиве четное число.
 */

public class PositiveOrNegative61 {
    public static boolean check(int[] data) {
        int posSum = 0, negSum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                negSum++;
            }
        }
        return negSum % 2 != 0;
    }
}
