import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

public class Maze_Tests {
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    public boolean[][] createVisited(char[][] grid)
    {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return visited;
    }

    @Test
    public void test1() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Maze"));
        Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

        char[][] grid = {   {'S', 'E'}};
        boolean[][] visited = createVisited(grid);
        boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 0,0);
        boolean expected = true;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Maze"));
        Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

        char[][] grid = {   {'S'},
                            {'E'}};
        boolean[][] visited = createVisited(grid);
        boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 0,0);
        boolean expected = true;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Maze"));
        Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

        char[][] grid = {   {'S', 'W', 'E'}};
        boolean[][] visited = createVisited(grid);
        boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 0,0);
        boolean expected = false;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Maze"));
        Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

        char[][] grid = {   {'-','-','E'},
                            {'W','-','W'},
                            {'W','-','S'}};
        boolean[][] visited = createVisited(grid);
        boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 2,2);
        boolean expected = true;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Maze"));
        Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

        char[][] grid = {   {'-','W','E'},
                            {'-','-','W'},
                            {'-','-','S'}};
        boolean[][] visited = createVisited(grid);
        boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 0,0);
        boolean expected = false;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Maze"));
        Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

        char[][] grid = {   {'-','S','W','-','-','-'},
                            {'-','W','-','-','W','-'},
                            {'-','-','-','-','W','E'}};
        boolean[][] visited = createVisited(grid);
        boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 1,0);
        boolean expected = true;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Maze"));
        Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

        char[][] grid = {   {'-','S','W','-','-','W'},
                            {'-','W','-','-','W','-'},
                            {'-','-','-','W','W','E'}};
        boolean[][] visited = createVisited(grid);
        boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 0,0);
        boolean expected = false;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Maze"));
        Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

        char[][] grid = {   {'-','-','-','-','-','-'},
                            {'E','-','-','-','-','S'},
                            {'-','-','-','-','-','-'}};
        boolean[][] visited = createVisited(grid);
        boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 5,1);
        boolean expected = true;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Maze"));
        Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

        char[][] grid = {   {'-','-','-','-','W','-'},
                            {'-','W','W','-','-','-'},
                            {'-','-','S','W','-','W'},
                            {'W','-','W','-','-','-'},
                            {'-','W','-','W','E','W'}};
        boolean[][] visited = createVisited(grid);
        boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 2,2);
        boolean expected = true;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Maze"));
        Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

        char[][] grid = {   {'-','-','-','-','W','-'},
                            {'-','W','W','-','-','-'},
                            {'-','-','S','W','-','W'},
                            {'W','-','W','-','-','-'},
                            {'E','W','-','W','-','W'}};
        boolean[][] visited = createVisited(grid);
        boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 0,0);
        boolean expected = false;

        Assert.assertEquals(expected,actual);
    }
}
