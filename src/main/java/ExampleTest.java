import org.junit.Test;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

public class ExampleTest {

    @Test
    @TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
    public void testMethod() {
        assertEquals(1, 1);
    }
}