import org.example.WorkClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WorkClassTest {

    @Test
    public void testG() {  // a = 4, b = -6
        double g = WorkClass.g(4, -6);
        assertEquals(28, g, 0.001);
    }
    @Test
    public void testWorkClass() { //    s = 6 t = -3
        double c = (WorkClass.g(1, 6) + Math.pow(1 + Math.pow(WorkClass.g(-3, 1), 2), 2)) /
                (1 + Math.pow(WorkClass.g(6 + -3, 1), 3));
        assertEquals(1.157, c, 0.001);
    }
}
