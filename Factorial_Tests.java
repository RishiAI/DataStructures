import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

public class Factorial_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("Factorial"));
        Method method = classRef.getMethod("factorial", long.class);

        long actual = (Long) method.invoke(method, 1);

        Assert.assertEquals(1,actual);
    }

    @Test
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factorial"));
        Method method = classRef.getMethod("factorial", long.class);

        long actual = (Long) method.invoke(method, 3);

        Assert.assertEquals(6,actual);
    }

    @Test
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factorial"));
        Method method = classRef.getMethod("factorial", long.class);

        long actual = (Long) method.invoke(method, 7);

        Assert.assertEquals(5040,actual);
    }

    @Test
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factorial"));
        Method method = classRef.getMethod("factorial", long.class);

        long actual = (Long) method.invoke(method, 31);

        Assert.assertEquals(Long.parseLong("4999213071378415616"),actual);
    }

    @Test
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factorial"));
        Method method = classRef.getMethod("factorial", long.class);

        long actual = (Long) method.invoke(method, 16);

        Assert.assertEquals(Long.parseLong("20922789888000"),actual);
    }

    @Test
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factorial"));
        Method method = classRef.getMethod("factorial", long.class);

        long actual = (Long) method.invoke(method, 14);

        Assert.assertEquals(Long.parseLong("87178291200"),actual);
    }

    @Test
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factorial"));
        Method method = classRef.getMethod("factorial", long.class);

        long actual = (Long) method.invoke(method, 11);

        Assert.assertEquals(39916800,actual);
    }

    @Test
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factorial"));
        Method method = classRef.getMethod("factorial", long.class);

        long actual = (Long) method.invoke(method, 2);

        Assert.assertEquals(2,actual);
    }

    @Test
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factorial"));
        Method method = classRef.getMethod("factorial", long.class);

        long actual = (Long) method.invoke(method, 19);

        Assert.assertEquals(Long.parseLong("121645100408832000"),actual);
    }

    @Test
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factorial"));
        Method method = classRef.getMethod("factorial", long.class);

        long actual = (Long) method.invoke(method, 8);

        Assert.assertEquals(40320,actual);
    }
}
