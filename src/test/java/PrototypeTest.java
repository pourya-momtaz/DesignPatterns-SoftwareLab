import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {
    @Test
    public void testPrototype() throws CloneNotSupportedException {
        Prototype prototype1 = new ConcretePrototype1("Prototype 1");
        Prototype prototype2 = prototype1.clone();
        assertEquals(prototype1.getDescription(), prototype2.getDescription());
        assertNotSame(prototype1, prototype2);

        Prototype prototype3 = new ConcretePrototype2("Prototype 2");
        Prototype prototype4 = prototype3.clone();
        assertEquals(prototype3.getDescription(), prototype4.getDescription());
        assertNotSame(prototype3, prototype4);
    }
}
