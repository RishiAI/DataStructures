public class Summation {
    public static int summation(int a, int b)
    {
        if(a == b)
            return b;
        else
            return b + summation(a,b-1);
    }

}
