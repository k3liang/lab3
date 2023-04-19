import static org.junit.Assert.*;
import org.junit.*;

import java.util.Arrays;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> lst = Arrays.asList("a", "b");

        assertEquals(lst, ListExamples.filter(lst, (s) -> true));
    }

    @Test
    public void testMerge() {
        List<String> lst1 = Arrays.asList();
        List<String> lst2 = Arrays.asList("a");

        assertEquals(Arrays.asList("a"), ListExamples.merge(lst1, lst2));
    }
}
