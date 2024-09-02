import java.util.ArrayList;
public class UniqueCount {
    public static int uniqueCount(int[] list) {
        ArrayList<Integer> noDupe = new ArrayList<Integer>();
        for (int i = 0; i <= list.length - 1; i++) {
            if (!noDupe.contains(list[i])){
                noDupe.add(list[i]);
        }

    }
        return noDupe.size();
}
}
