import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

public class Summation_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("Summation"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual = (Integer) method.invoke(method, 1,1);

        Assert.assertEquals(1,actual);
    }

    @Test
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Summation"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual = (Integer) method.invoke(method, 1,2);

        Assert.assertEquals(3, actual);
    }

    @Test
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Summation"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual = (Integer) method.invoke(method, 4,7);

        Assert.assertEquals(22,actual);
    }

    @Test
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Summation"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual = (Integer) method.invoke(method, 44,137);

        Assert.assertEquals(8507,actual);
    }

    @Test
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Summation"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual = (Integer) method.invoke(method, 8,55);

        Assert.assertEquals(1512,actual);
    }

    @Test
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Summation"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual = (Integer) method.invoke(method, 4,47);

        Assert.assertEquals(1122,actual);
    }

    @Test
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Summation"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual = (Integer) method.invoke(method, 11,12);

        Assert.assertEquals(23, actual);
    }

    @Test
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Summation"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual = (Integer) method.invoke(method, 99,199);

        Assert.assertEquals(15049,actual);
    }

    @Test
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Summation"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual = (Integer) method.invoke(method, 248,543);

        Assert.assertEquals(117068,actual);
    }

    @Test
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Summation"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual = (Integer) method.invoke(method, 19,77);

        Assert.assertEquals(2832,actual);
    }

}
