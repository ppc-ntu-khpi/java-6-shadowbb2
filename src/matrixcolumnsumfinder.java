/**
 * Клас для роботи зі стовпцями матриці.
 * Містить метод для пошуку стовпця з максимальною сумою елементів.
 *
 * @author Your Name
 * @version 1.0
 */
public class matrixcolumnsumfinder {

    /**
     * Знаходить індекс стовпця матриці з максимальною сумою елементів.
     *
     * @param matrix прямокутна матриця (N x M), не null і не порожня
     * @return індекс стовпця з максимальною сумою (якщо кілька — повертає найменший індекс)
     * @throws IllegalArgumentException якщо матриця null, порожня або не прямокутна
     */
    public static int findColumnWithMaxSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            throw new IllegalArgumentException("Матриця не може бути null або порожньою");
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Перевірка, що матриця прямокутна
        for (int[] row : matrix) {
            if (row == null || row.length != cols) {
                throw new IllegalArgumentException("Матриця має бути прямокутною");
            }
        }

        // Масив сум стовпців
        int[] columnSums = new int[cols];

        // Заповнення сум стовпців (використовуємо for-each, як просили мінімізувати цикли)
        for (int[] row : matrix) {
            for (int j = 0; j < cols; j++) {
                columnSums[j] += row[j];
            }
        }

        // Знаходимо індекс максимального елемента в масиві сум за допомогою Arrays
        int maxIndex = 0;
        for (int i = 1; i < columnSums.length; i++) {
            if (columnSums[i] > columnSums[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}