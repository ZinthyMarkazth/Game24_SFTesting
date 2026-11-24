/* 
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradeCalculatorTest {

    private GradeCalculator calc;

    @Before
    public void setUp() {
        calc = new GradeCalculator();
    }

    // ---------- R1: แปลงคะแนนเป็นเกรด ----------

    @Test
    public void tc01_score100IsA() {
        assertEquals("A", calc.gradeOf(100));
    }

    @Test
    public void tc02_score80IsA() {
        assertEquals("A", calc.gradeOf(80));
    }

    @Test
    public void tc03_score79IsBPlus() {
        assertEquals("B+", calc.gradeOf(79));
    }

    @Test
    public void tc04_score70IsB() {
        assertEquals("B", calc.gradeOf(70));
    }

    @Test
    public void tc05_score65IsCPlus() {
        assertEquals("C+", calc.gradeOf(65));
    }

    @Test
    public void tc06_score60IsC() {
        assertEquals("C", calc.gradeOf(60));
    }

    @Test
    public void tc07_score55IsDPlus() {
        assertEquals("D+", calc.gradeOf(55));
    }

    @Test
    public void tc08_score50IsD() {
        assertEquals("D", calc.gradeOf(50));
    }

    @Test
    public void tc09_score49IsF() {
        assertEquals("F", calc.gradeOf(49));
    }

    @Test
    public void tc10_score0IsF() {
        assertEquals("F", calc.gradeOf(0));
    }

    // ---------- R2: คะแนนนอกช่วงต้องแจ้ง error ----------

    @Test(expected = IllegalArgumentException.class)
    public void tc11_negativeScoreThrows() {
        calc.gradeOf(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tc12_scoreAbove100Throws() {
        calc.gradeOf(101);
    }
}*/