import static org.junit.Assert.*;
import org.junit.*;

import java.io.File;
import java.io.IOException;

import java.util.List;
import java.util.Arrays;

public class FileTests {
    @Test
    public void testFolderPath() throws IOException {
        List<File> lst = Arrays.asList(new File("some-files/more-files/c.txt"));

        assertEquals(lst, FileExample.getFiles(new File("some-files/more-files")));
    }

    @Test
    public void testSubDirectories() throws IOException {
        List<File> lst = Arrays.asList(new File("some-files/a.txt"), new File("some-files/even-more-files/b.txt"), new File("some-files/more-files/c.txt"));

        assertEquals(lst, FileExample.getFiles(new File("some-files/")));
    }
}
