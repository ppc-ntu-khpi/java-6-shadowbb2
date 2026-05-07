import java.util.Arrays;

public class testmatrixcolumnsumfinder {

    public static void main(String[] args) {
        System.out.println("=== Тестування MatrixColumnFinder ===\n");

        // Тест 1: Матриця 3x3
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        testMatrix(matrix1, "Матриця 3x3");

        // Тест 2: Матриця 2x4
        int[][] matrix2 = {
            {10, -1, 3,  4},
            { 1, 20, -5, 6}
        };
        testMatrix(matrix2, "Матриця 2x4");

        // Тест 3: Матриця з негативними числами
        int[][] matrix3 = {
            {-5, -10, -3},
            {-1,  -2, -8}
        };
        testMatrix(matrix3, "Матриця з негативними значеннями");

        // Тест 4: Матриця 1x1
        int[][] matrix4 = {{42}};
        testMatrix(matrix4, "Матриця 1x1");
    }

    private static void testMatrix(int[][] matrix, String description) {
        System.out.println(description);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        try {
            int colIndex = MatrixColumnFinder.findColumnWithMaxSum(matrix);
            System.out.println("→ Стовпець з максимальною сумою: " + colIndex);
            
            // Додатково показуємо суму
            int sum = 0;
            for (int[] row : matrix) {
                sum += row[colIndex];
            }
            System.out.println("   Сума елементів: " + sum + "\n");
        } catch (Exception e) {
            System.out.println("   Помилка: " + e.getMessage() + "\n");
        }
    }
}