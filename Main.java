import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Test for Absolute Difference
        AbsoluteDifference Differ = new AbsoluteDifference();
        ArrayList<Integer> test1 = new ArrayList<Integer>();
        ArrayList<Integer> test2 = new ArrayList<Integer>();
        int[] list1Values = {1,2,3,4,5};
        int[] list2Values = {1,2,3,4,5};
        for(int v: list1Values)
            test1.add(v);
        for(int v: list2Values)
            test2.add(v);
        System.out.print(Differ.absoluteDifference(test1, test2));

        // Test for Balanced
        /*
        Balanced Bal = new Balanced();
        int[][] test = {    {0,5,6},
                            {5,0,4},
                            {5,5,0}    };;
        System.out.println(Bal.balanced(test));
         */






        //Test for Trip (delete the "/*" and "*/" when running)
        /*
        Trip Trash = new Trip();
        int[] test = new int[10];
        Random rand = new Random();
        for (int i = 0; i < test.length; i++) {
            test[i] = rand.nextInt(20);
        }
        int[] test2 = {3,6,8,55,4,3};
        int cap = rand.nextInt(5);
        System.out.println(Trash.fuelUsed(test2, 1)); //should be 594
        System.out.println(Trash.fuelUsed(test2, 7)); //should be 98
        */






        //Test for UniqueCount (delete the "/*" and "*/" when running)
        /*
        int[] test = new int[100];
        Random rand = new Random();
        for (int i = 0; i < test.length; i++){
            test[i] = rand.nextInt(20);
        }
        UniqueCount Count = new UniqueCount();
        int[] try1 = {1,2,3,4,4,3,2,1};
        //should be 4
        int[] try2 = {9,9,9,9,93,93,95,9,9,9};
        //should be 3
        System.out.println(Count.uniqueCount(test));
        System.out.println(Count.uniqueCount(try1));
        System.out.println(Count.uniqueCount(try2));
        */



    }
}