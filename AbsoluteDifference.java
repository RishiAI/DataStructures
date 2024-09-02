import java.util.ArrayList;

public class AbsoluteDifference {
    public static ArrayList<Integer> absoluteDifference(ArrayList<Integer> listA, ArrayList<Integer> listB){
        ArrayList<Integer> diff = new ArrayList<Integer>();
        for(int i=0; i < listA.size(); i++){
            diff.add(i, listA.get(i)-listB.get(i));
            if (diff.get(i) < 0){
                diff.set(i, diff.get(i)*-1);
            }
        }
        return diff;
    }
}
