import java.util.ArrayList;
public class Basket{
    public static ArrayList<Object> basketItems;
    public Basket() {
        this.basketItems = new ArrayList<>();
    }
    public static ArrayList<Object> addItem(Object anything) {
        basketItems.add(anything);
        return basketItems;
    }
}

