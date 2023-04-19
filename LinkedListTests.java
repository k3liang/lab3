import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testAppend() {
        LinkedList lst = new LinkedList();
        lst.append(1);
        lst.append(2);
        lst.append(3);

        assertEquals("1 2 3 ", lst.toString());
    }
}
