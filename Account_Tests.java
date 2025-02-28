import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Account_Tests
{
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    // Constructor Tests
    @Test
    public void test1() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Account"));
        Object account = classRef.getConstructor(long.class,String.class,double.class).newInstance
                (Long.parseLong("123456764"),"Billy Smith",100.0);

        Method getCustomerName = classRef.getMethod("getCustomerName");
        Method getAccountNumber = classRef.getMethod("getAccountNumber");
        Method getBalance = classRef.getMethod("getBalance");


        Assert.assertEquals("Billy Smith",(String)getCustomerName.invoke(account));
        Assert.assertEquals(Long.parseLong("123456764"),(long)getAccountNumber.invoke(account));
        Assert.assertEquals(100.0,(double)getBalance.invoke(account),.001);
    }

    @Test
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Account"));
        Object account = classRef.getConstructor(long.class,String.class,double.class).newInstance
                (Long.parseLong("999999"),"Jane Doe",99975.99);

        Method getCustomerName = classRef.getMethod("getCustomerName");
        Method getAccountNumber = classRef.getMethod("getAccountNumber");
        Method getBalance = classRef.getMethod("getBalance");


        Assert.assertEquals("Jane Doe",(String)getCustomerName.invoke(account));
        Assert.assertEquals(Long.parseLong("999999"),(long)getAccountNumber.invoke(account));
        Assert.assertEquals(99975.99,(double)getBalance.invoke(account),.001);
    }

    @Test
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Account"));
        Object account = classRef.getConstructor(long.class,String.class,double.class).newInstance
                (Long.parseLong("432255"),"Todd Turtle",499563.25);

        Method getCustomerName = classRef.getMethod("getCustomerName");
        Method getAccountNumber = classRef.getMethod("getAccountNumber");
        Method getBalance = classRef.getMethod("getBalance");


        Assert.assertEquals("Todd Turtle",(String)getCustomerName.invoke(account));
        Assert.assertEquals(Long.parseLong("432255"),(long)getAccountNumber.invoke(account));
        Assert.assertEquals(499563.25,(double)getBalance.invoke(account),.001);
    }

    // Deposit Tests
    @Test
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Account"));
        Object account = classRef.getConstructor(long.class,String.class,double.class).newInstance
                (Long.parseLong("123456764"),"Billy Smith",100.0);

        Method getBalance = classRef.getMethod("getBalance");
        Method deposit = classRef.getMethod("deposit",double.class);

        Assert.assertEquals(false,deposit.invoke(account,-987));
        Assert.assertEquals(100.0,(double)getBalance.invoke(account),.001);
    }

    @Test
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Account"));
        Object account = classRef.getConstructor(long.class,String.class,double.class).newInstance
                (Long.parseLong("999999"),"Jane Doe",99975.99);

        Method getBalance = classRef.getMethod("getBalance");
        Method deposit = classRef.getMethod("deposit",double.class);

        Assert.assertEquals(false,deposit.invoke(account,0));
        Assert.assertEquals(99975.99,(double)getBalance.invoke(account),.001);
    }

    @Test
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Account"));
        Object account = classRef.getConstructor(long.class,String.class,double.class).newInstance
                (Long.parseLong("432255"),"Todd Turtle",499563.25);

        Method getBalance = classRef.getMethod("getBalance");
        Method deposit = classRef.getMethod("deposit",double.class);

        Assert.assertEquals(true,deposit.invoke(account,987));
        Assert.assertEquals(500550.25,(double)getBalance.invoke(account),.001);
    }

    // Deposit Tests
    @Test
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Account"));
        Object account = classRef.getConstructor(long.class,String.class,double.class).newInstance
                (Long.parseLong("123456764"),"Billy Smith",100.0);

        Method getBalance = classRef.getMethod("getBalance");
        Method withdraw = classRef.getMethod("withdraw",double.class);

        Assert.assertEquals(false,withdraw.invoke(account,-987));
        Assert.assertEquals(100.0,(double)getBalance.invoke(account),.001);
    }

    @Test
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Account"));
        Object account = classRef.getConstructor(long.class,String.class,double.class).newInstance
                (Long.parseLong("999999"),"Jane Doe",99975.99);

        Method getBalance = classRef.getMethod("getBalance");
        Method withdraw = classRef.getMethod("withdraw",double.class);

        Assert.assertEquals(false,withdraw.invoke(account,0));
        Assert.assertEquals(99975.99,(double)getBalance.invoke(account),.001);
    }

    @Test
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Account"));
        Object account = classRef.getConstructor(long.class,String.class,double.class).newInstance
                (Long.parseLong("432255"),"Todd Turtle",499563.25);

        Method getBalance = classRef.getMethod("getBalance");
        Method withdraw = classRef.getMethod("withdraw",double.class);

        Assert.assertEquals(true,withdraw.invoke(account,235400));
        Assert.assertEquals(264163.25,(double)getBalance.invoke(account),.001);
    }

    @Test
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Account"));
        Object account = classRef.getConstructor(long.class,String.class,double.class).newInstance
                (Long.parseLong("432255"),"Todd Turtle",499563.25);

        Method getBalance = classRef.getMethod("getBalance");
        Method withdraw = classRef.getMethod("withdraw",double.class);

        Assert.assertEquals(false,withdraw.invoke(account,800000));
    }
}
