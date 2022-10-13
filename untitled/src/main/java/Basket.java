import java.lang.reflect.Array;
import java.util.ArrayList;

public class Basket{

    private static Basket BasketItems;

//    public static void main(String[] args) {
//        ArrayList BasketItems = new ArrayList();
//    }

    public static ArrayList addItem(item){
        BasketItems.add(item);
        return BasketItems();

    }

    private static ArrayList BasketItems() {
    }


}


