import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

        @Test
        @DisplayName("Add two numbers")
        void addItem() {
            // Arrange
            Basket basket1 = new Basket();
            Item item1 = new Item("item");

            // Act
            ArrayList<Object> result = Basket.addItem(item1.name);

            // Assert
            assertEquals(Basket.basketItems, result);

    }
}
