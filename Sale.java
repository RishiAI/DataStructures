import java.util.ArrayList;

public class Sale {
    public static void sale(ArrayList<Item> inventory) {

        for(int i = inventory.size()-1; i>=0; i--){
            if(inventory.get(i).getStatus() == 2){
                inventory.remove(i);
            }
            else if (inventory.get(i).getStatus() == 1){
                inventory.get(i).setStatus(2);
                inventory.get(i).setPrice(inventory.get(i).getPrice()*.5);

            }
            else{
                inventory.get(i).setStatus(1);
                inventory.get(i).setPrice(inventory.get(i).getPrice()*.7);
            }
        }

    }

}
