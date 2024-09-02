import java.util.ArrayList;

public class Removal {
    public static void removeAllInRange(ArrayList<Integer> numbers, int lower, int upper){
        for (int i = numbers.size()-1; i >= 0; i--){
            if(numbers.get(i) <= upper && numbers.get(i) >= lower){
                numbers.remove(i);

            }

        }

    }
}
