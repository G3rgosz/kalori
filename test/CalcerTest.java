import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalcerTest {
    Calcer calcer;
    @BeforeEach
    void setUp(){
        calcer = new Calcer();
    }
    @Test
    void calcWomanBMRTest(){
        double weight = 80;
        double height = 180;
        double age = 30;
        calcer.setData(weight, height, age);
        double actual = calcer.calcWomanBMR();
        double expected = 1615.09;
        assertEquals(expected, actual, 0.01);
    }
    @Test
    void calcManBMRTest(){
        double weight = 80;
        double height = 180;
        double age = 30;
        calcer.setData(weight, height, age);
        double actual = calcer.calcManBMR();
        double expected = 1853.93;
        assertEquals(expected, actual, 0.01);
    }
    @Test
    void calcManBMRNegativeTest(){
        double weight = 80;
        double height = -1;
        double age = 30;
        calcer.setData(weight, height, age);
        double actual = calcer.calcManBMR();
        double expected = -1;
        assertEquals(expected, actual, 0.01);
    }
}
