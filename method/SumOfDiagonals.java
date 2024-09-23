package method;

// Պետքա գրել ծրագիր, որը կհաշվի մատրիցայի անկյունագծերի վրայի թվերի գումարը։
public class SumOfDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 1, 1},
                {5, 1, 1, 1, 1},
                {9, 1, 1, 12, 1},
                {1, 1, 15, 1, 1},
                {1, 5, 8, 9, 1}
        };

        int DiagonalSum1 = 0;
        int DiagonalSum2 = 0;
        int DiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j)
                    DiagonalSum1 = DiagonalSum1 + matrix[i][j];
                if(i == j && (i + j) == (matrix.length - 1))
                    continue;
                if ((i + j) == (matrix.length - 1)) {
                    DiagonalSum2 = DiagonalSum2 = DiagonalSum2 + matrix[i][j];
                }
                DiagonalSum = DiagonalSum1 + DiagonalSum2;
            }
        }
        System.out.println(DiagonalSum);
    }
}


