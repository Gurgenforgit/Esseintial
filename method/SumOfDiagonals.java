package method;
// Պետքա գրել ծրագիր, որը կհաշվի մատրիցայի անկյունագծերի վրայի թվերի գումարը։
public class SumOfDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        // Calculate first Diagonal - from top left corner to the right bottom  corner
        int DiagonalSum1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j)
                    DiagonalSum1 = DiagonalSum1 + matrix[i][j];
            }
        }
        // Calculating second Diagonal - from top right corner to the left bottom corner
        int DiagonalSum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 4; j++) {
                if((i + j) == 3)
                 DiagonalSum2 = DiagonalSum2 + matrix[i][j];
            }
        }
        int DiagonalsSum = DiagonalSum1 + DiagonalSum2;
        System.out.println("Summary of two diagonals is " + DiagonalsSum);
    }
}

