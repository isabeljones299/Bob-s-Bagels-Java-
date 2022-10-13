import java.lang.reflect.Array;

public class BasketTest {

        @Test
        @DisplayName("Add two numbers")
        void add() {
            // Arrange
            Item item1 = new Item();
            Basket basket1 = new Basket();


            // Act
            Array[] result = Basket.add(item1);

            // Assert
            assertEquals(BasketItems, result);

    }
}
