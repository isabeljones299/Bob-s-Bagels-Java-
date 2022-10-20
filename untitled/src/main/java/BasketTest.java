import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasketTest {

        @Test
        @DisplayName("Add an item to the basket")
        void addItem() {
            // Arrange
            Basket basket1 = new Basket(3);
            Item item1 = new Item("item");

            // Act
            basket1.addItem(item1);
            String result = basket1.basketItems.get(0).name;
            System.out.println(basket1.basketItems);
            // Assert
            assertEquals("item", result);

    }
    @Test
    @DisplayName("Remove an item from the basket")
    void removeItem() {
        // Arrange
        Basket basket1 = new Basket(3);
        Item item1 = new Item("item");

        //Act
        basket1.addItem(item1);

        ArrayList<Item> result = basket1.removeItem(item1);
        System.out.println(basket1.basketItems);
        // Assert
        assertTrue(result.isEmpty());

    }
    @Test
    @DisplayName("Capacity is not exceeded")
    void add2Item() {
        // Arrange
        Basket basket1 = new Basket(1);
        Item item1 = new Item("item");

        // Act
        basket1.addItem(item1);
        basket1.addItem(item1);
        int result = basket1.basketItems.size();
        System.out.println(basket1.basketItems);
        // Assert
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Increase the capacity")
    void increaseCapacity() {
        // Arrange
        Basket basket1 = new Basket(1);
        Item item1 = new Item("item");

        // Act
        basket1.increaseCapacity(5);
        int result = basket1.capacity;
        System.out.println(basket1.capacity);
        // Assert
        assertEquals(6, result);
    }
    @Test
    @DisplayName("Notified when adding duplicate items")
    void increaseCapacity() {
        // Arrange
        Basket basket1 = new Basket(1);
        Item item1 = new Item("item");

        // Act
        basket1.increaseCapacity(5);
        int result = basket1.capacity;
        System.out.println(basket1.capacity);
        // Assert
        assertEquals(6, result);
    }



}
