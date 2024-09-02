public class Money {
    public static int[] fewest(int cents){
        int[] few = new int[10];
        int[] value = {1, 5, 10, 25, 100, 500, 1000, 2000, 5000, 10000};

        for (int i = value.length - 1; i >= 0; i--) {
            few[i] = cents / value[i];
            cents %= value[i];
        }
        return few;
    }

}
