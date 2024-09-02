public class Balanced {
    public static boolean balanced(int[][] grid){
        int left = 0;
        int right = 0;
        boolean isRight = false;

        for (int i = 0; i<= grid.length-1; i++) {
            for (int j = 0; j <= grid[0].length-1; j++) {
                if(i == j){
                    isRight = true;
                }
                if(!isRight){
                    left+= grid[i][j];
                    System.out.println(left);
                }
                else{
                    right+= grid[i][j];
                    System.out.println(right);
                }
            }
            isRight = false;
        }

        return (left==right);
    }
}
