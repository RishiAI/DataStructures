public class Spiral {
    public static char[][] javaSpiral(int numCols, int numRows) {
        char[][] spiral = new char[numRows][numCols];
        char[] java = {'j', 'a', 'v', 'a'};
        int index = 0;

        int left = 0, top = 0;
        int right = numCols - 1, bottom = numRows - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                spiral[top][i] = java[index];
                index = (index + 1) % 4;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = java[index];
                index = (index + 1) % 4;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral[bottom][i] = java[index];
                    index = (index + 1) % 4;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral[i][left] = java[index];
                    index = (index + 1) % 4;
                }
                left++;
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.printf("%-2c", spiral[i][j]);
            }
            System.out.printf("\n");
        }

        return spiral;
    }
    }
