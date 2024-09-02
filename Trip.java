import java.util.ArrayList;
import java.util.Arrays;

public class Trip {
    public static int fuelUsed(int[] site, int capacity) {
        int fuelNeeded = 0;
        int capacityLeft = capacity;
        int position = -1;
        ArrayList<Integer> siteList = new ArrayList<Integer>();

        for (int i = 0; i <= site.length -1 ; i++) {
            siteList.add(site[i]);
        }
        for (int i = 0; i < siteList.size(); i++) {
            while (siteList.get(i) > 0) {

                fuelNeeded += (i - position);
                position = i;


                if (siteList.get(i) > capacityLeft) {
                    siteList.set(i, siteList.get(i) - capacityLeft);
                    capacityLeft = 0;
                } else {
                    capacityLeft -= siteList.get(i);
                    siteList.set(i, 0);
                }


                if (capacityLeft == 0 || i == siteList.size() - 1) {
                    fuelNeeded += (position + 1);
                    position = -1;
                    capacityLeft = capacity;
                }

            }
            System.out.println(siteList);
        }

        if (position != -1) {
            fuelNeeded += (position + 1);
        }
        for (int i = 0; i < siteList.size(); i++)
        {
            site[i] = siteList.get(i);
        }
        System.out.println(Arrays.toString(site));
        return fuelNeeded;
    }
}