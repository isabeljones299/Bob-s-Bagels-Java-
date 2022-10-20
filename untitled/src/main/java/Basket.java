import java.util.ArrayList;
public class Basket {
    public ArrayList<Item> basketItems = new ArrayList<>();
    public int capacity;

    public Basket(int capacity) {
        this.capacity = capacity;
        this.basketItems = new ArrayList<>();
    }

    public String addItem(Item anything) {
        System.out.println(isFull());
        if (isFull() == "basket not full") {
            basketItems.add(anything);
            return this.isItemInBasket(anything);
        }
        return "Item added";
    }

    public Boolean removeItem(Item anything) {
        basketItems.remove(anything);
        return basketItems.remove(anything);
    }

    public String isFull() {
        if (basketItems.size() >= capacity) {
            return "Sorry basket is full";
        } else
            return "basket not full";
    }

    public String isItemInBasket(Item anyItem) {
        String output = "This item is not in basket";
        for (Item i: basketItems) {
            if (i == anyItem) {
                output = "The item is already in the basket";
               // return "The item is already in the basket";
            }
        } return output;
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



