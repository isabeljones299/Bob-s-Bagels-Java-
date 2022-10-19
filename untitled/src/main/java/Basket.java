import java.util.ArrayList;
public class Basket {
    public ArrayList<Item> basketItems = new ArrayList<>();
    public int capacity;

    public Basket(int capacity) {
        this.capacity = capacity;
        this.basketItems = new ArrayList<>();
    }

    public ArrayList<Item> addItem(Item anything) {
        System.out.println(isFull());
        if (isFull() == "basket not full") {
            basketItems.add(anything);
            return basketItems;
        }
        return basketItems;
    }

    public ArrayList<Item> removeItem(Item anything) {
        basketItems.remove(anything);
        return basketItems;
    }

    public String isFull() {
        if (basketItems.size() >= capacity) {
            return "Sorry basket is full";
        } else
            return "basket not full";
    }

    public void increaseCapacity(int num){

        capacity += num;
    }


}


//    public ArrayList<Item> basketCapacity() {
//
//        for(int i = 0; i < 20; i++) {
//            try {
//                newItems.add(basketItems)
//            }
//        }
//
       // return basketItems;



