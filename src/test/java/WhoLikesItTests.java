import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhoLikesItTests {

    @Test
    public void staticTests() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
        assertEquals("Peter likes this", WhoLikesIt.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        assertEquals("Alex, Jacob and 3 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max", "Bob"));
        assertEquals("Alex, Jacob and 4 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max", "Bob", "Jim"));
    }
}