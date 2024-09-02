public class Maze {
    public static boolean isSolvable(char[][] maze, boolean[][] beenThere, int column, int row){
        maze[row][column] = 'S';
        beenThere[row][column] = true;
        if(maze[row+1][column] == 'E'){
            return true;
        }
        if(maze[row][column-1] == 'E'){
            return true;
        }
        if(maze[row][column+1] == 'E'){
            return true;
        }
        if(maze[row-1][column] == 'E'){
            return true;
        }
        if(maze[row+1][column] == '-' || !atBounds(maze, row, column)){
            row++;
            beenThere[row+1][column] = true;
        }
        if (maze[row-1][column] == '-' || !atBounds(maze, row, column)){
            row--;
            beenThere[row-1][column] = true;
        }
        if (maze[row][column+1] == '-' || !atBounds(maze, row, column)){
            column++;
            beenThere[row][column+1] = true;
        }
        if (maze[row][column-1] == '-' || !atBounds(maze, row, column)){
            column--;
            beenThere[row][column-1] = true;
        }
        isSolvable(maze, beenThere, column, row);
        return false;
    }
    public static boolean atBounds(char[][] maze, int column, int row){
        if (row != maze.length-1 && row != 0 && column != maze[0].length-1 && row != 0)
            return false;
        else
            return true;
    }
}
