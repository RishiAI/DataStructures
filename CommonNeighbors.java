public class CommonNeighbors {
    public static int[] commonNeighbors(int[] list) {
        if (list.length == 1) {
            list[0] = 0;
            return list;
        }
        for (int i = 0; i <= list.length - 1; i++) {
            if (i == 0) {
                if (list[i]!=list[i+1]){
                    list[i]=0;
                }
            }
            else if (i == list.length-1){
                if (list[i]!=list[i-1]){
                    list[i]=0;
                }
            }
            else{
                if (list[i]!=list[i-1] && list[i]!=list[i+1]){
                    list[i]=0;
                }
            }
        }

        return list;
    }
}