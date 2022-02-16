import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

public class quickTest {
    

    @Test
    public void testEqualsSame() {
        Student student1 = new Student(new String("Test"), 
            new String("Student"), new String("A12345678"));
        Student student2 = new Student(new String("Test"), 
            new String("Student"), new String("A12345678"));
        assertTrue(student1.equals(student2));
    }
    
}
