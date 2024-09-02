import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Money_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("Money"));
        Method method = classRef.getMethod("fewest", int.class);

        int[] actual = (int[])method.invoke(method, 126);
        int[] expectedSite = {1, 0, 0, 1, 1, 0, 0, 0, 0, 0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(actual));
    }

    @Test
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Money"));
        Method method = classRef.getMethod("fewest", int.class);

        int[] actual = (int[])method.invoke(method, 8641);
        int[] expectedSite = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(actual));
    }

    @Test
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Money"));
        Method method = classRef.getMethod("fewest", int.class);

        int[] actual = (int[])method.invoke(method, 0);
        int[] expectedSite = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(actual));
    }

    @Test
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Money"));
        Method method = classRef.getMethod("fewest", int.class);

        int[] actual = (int[])method.invoke(method, 2025);
        int[] expectedSite = {0, 0, 0, 1, 0, 0, 0, 1, 0, 0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(actual));
    }

    @Test
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Money"));
        Method method = classRef.getMethod("fewest", int.class);

        int[] actual = (int[])method.invoke(method, 76);
        int[] expectedSite = {1, 0, 0, 3, 0, 0, 0, 0, 0, 0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(actual));
    }

    @Test
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Money"));
        Method method = classRef.getMethod("fewest", int.class);

        int[] actual = (int[])method.invoke(method, 199);
        int[] expectedSite = {4, 0, 2, 3, 1, 0, 0, 0, 0, 0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(actual));
    }

    @Test
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Money"));
        Method method = classRef.getMethod("fewest", int.class);

        int[] actual = (int[])method.invoke(method, 698452);
        int[] expectedSite = {2, 0, 0, 2, 4, 0, 1, 1, 1, 69};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(actual));
    }

    @Test
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Money"));
        Method method = classRef.getMethod("fewest", int.class);

        int[] actual = (int[])method.invoke(method, 123456);
        int[] expectedSite = {1, 1, 0, 2, 4, 0, 1, 1, 0, 12};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(actual));
    }

    @Test
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Money"));
        Method method = classRef.getMethod("fewest", int.class);

        int[] actual = (int[])method.invoke(method, 124);
        int[] expectedSite = {4, 0, 2, 0, 1, 0, 0, 0, 0, 0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(actual));
    }

    @Test
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Money"));
        Method method = classRef.getMethod("fewest", int.class);

        int[] actual = (int[])method.invoke(method, 3999);
        int[] expectedSite = {4, 0, 2, 3, 4, 1, 1, 1, 0, 0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(actual));
    }
}
