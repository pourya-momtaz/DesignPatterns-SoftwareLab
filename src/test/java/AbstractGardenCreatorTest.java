import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractGardenCreatorTest {
    @Test
    public void testJapaneseGardenCreator() {
        AbstractGardenCreator factory = new JapaneseGardenCreator();
        Client client = new Client(factory);
        assertEquals("Japanese Flower", client.getFlower());
        assertEquals("Japanese Tree", client.getTree());
    }

    @Test
    public void testIranianGardenCreator() {
        AbstractGardenCreator factory = new IranianGardenCreator();
        Client client = new Client(factory);
        assertEquals("Iranian Flower", client.getFlower());
        assertEquals("Iranian Tree", client.getTree());
    }
}
