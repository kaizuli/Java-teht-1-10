package fi.samk;

public class MatriisinSuurin {
    public int[] findBiggestIndex(int[][] matrix) {
        int big = 0;
        int[] place = new int[2];

        for (int x = 0; x < matrix.length; ++x) {
            for (int y = 0; y < matrix[x].length; ++y) {
                if (matrix[x][y] > big) {
                    big = matrix[x][y];
                    place[0] = x;
                    place[1] = y;
                }
            }

        }
        return place;
    }
}
