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

        int DiagonalSum1 = 0;
        int DiagonalSum2 = 0;
        int DiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j)
                    DiagonalSum1 = DiagonalSum1 + matrix[i][j];
                if ((i + j) == (matrix.length - 1))
                    DiagonalSum2 = DiagonalSum2 = DiagonalSum2 + matrix[i][j];
                DiagonalSum = DiagonalSum1 + DiagonalSum2;
            }
        }
        System.out.println(DiagonalSum);
    }
}


