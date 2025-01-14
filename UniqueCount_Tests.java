import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class UniqueCount_Tests {
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    @Test
    public void test1() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("UniqueCount"));
        Method method = classRef.getMethod("uniqueCount", int[].class);

        int[] list = {1};
        int actual = (Integer) method.invoke(method, list);
        int expected = 1;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("UniqueCount"));
        Method method = classRef.getMethod("uniqueCount", int[].class);

        int[] list = {1,2,3};
        int actual = (Integer) method.invoke(method, list);
        int expected = 3;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("UniqueCount"));
        Method method = classRef.getMethod("uniqueCount", int[].class);

        int[] list = {4,3,5,8,7,6,9,5,2,1,4,7,6,79};
        int actual = (Integer) method.invoke(method, list);
        int expected = 10;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("UniqueCount"));
        Method method = classRef.getMethod("uniqueCount", int[].class);

        int[] list = {101,25,13,47,57,47,12};
        int actual = (Integer) method.invoke(method, list);
        int expected = 6;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("UniqueCount"));
        Method method = classRef.getMethod("uniqueCount", int[].class);

        int[] list = {1,12,14,1,7,18,55,16,1};
        int actual = (Integer) method.invoke(method, list);
        int expected = 7;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("UniqueCount"));
        Method method = classRef.getMethod("uniqueCount", int[].class);

        int[] list = {1,2,3,4,5,6,1,5,6};
        int actual = (Integer) method.invoke(method, list);
        int expected = 6;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("UniqueCount"));
        Method method = classRef.getMethod("uniqueCount", int[].class);

        int[] list = {1,2,3,4,4,3,2,1};
        int actual = (Integer) method.invoke(method, list);
        int expected = 4;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("UniqueCount"));
        Method method = classRef.getMethod("uniqueCount", int[].class);

        int[] list = {9,9,9,9,93,93,95,9,9,9};
        int actual = (Integer) method.invoke(method, list);
        int expected = 3;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("UniqueCount"));
        Method method = classRef.getMethod("uniqueCount", int[].class);

        int[] list = {77,78};
        int actual = (Integer) method.invoke(method, list);
        int expected = 2;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("UniqueCount"));
        Method method = classRef.getMethod("uniqueCount", int[].class);

        int[] list = {1,7,4,5,6,9,8,3,2,2,7,1};
        int actual = (Integer) method.invoke(method, list);
        int expected = 9;

        Assert.assertEquals(expected,actual);
    }
}
