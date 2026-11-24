import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradeCalculatorTest {

    private GradeCalculator calc;

    @Before
    public void setUp() {
        calc = new GradeCalculator();
    }

    @Test
    public void tc01_score100IsA() {
        assertEquals("A", calc.gradeOf(100));
    }
    @Test
    public void tc09_score49IsF() {
        assertEquals("F", calc.gradeOf(49));
    }
}