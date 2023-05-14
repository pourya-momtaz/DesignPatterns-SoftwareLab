import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest {
    @Test
    public void testBuilder() {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        director.construct(builder1);
        Product product1 = builder1.getResult();
        assertEquals("Part A1, Part B1, Part C1", product1.getDescription());

        director.construct(builder2);
        Product product2 = builder2.getResult();
        assertEquals("Part A2, Part B2, Part C2", product2.getDescription());
    }
}
