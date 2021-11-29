// Szivák Gergő
// 2021.11.29.
// SZOFTIIN
// https://github.com/Gergosz-2000/kalori

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
        assertEquals(expected, actual);
    }
    @Test
    void calcWomanBMRNegativeTest(){
        double weight = -1;
        double height = 160;
        double age = -1;
        calcer.setData(weight, height, age);
        double actual = calcer.calcWomanBMR();
        double expected = -1;
        assertEquals(expected, actual);
    }
    @Test
    void calcManBMRNullTest(){
        double weight = 0;
        double height = 0;
        double age = 0;
        calcer.setData(weight, height, age);
        double actual = calcer.calcManBMR();
        double expected = -1;
        assertEquals(expected, actual);
    }
    @Test
    void calcWomanBMRNullTest(){
        double weight = 0;
        double height = 0;
        double age = 0;
        calcer.setData(weight, height, age);
        double actual = calcer.calcWomanBMR();
        double expected = -1;
        assertEquals(expected, actual);
    }
    @Test
    void calcManBMRMinTest(){
        double weight = 1;
        double height = 1;
        double age = 1;
        calcer.setData(weight, height, age);
        double actual = calcer.calcManBMR();
        double expected = 100.89;
        assertEquals(expected, actual, 0.01);
    }
    @Test
    void calcWomanBMRMinTest(){
        double weight = 1;
        double height = 1;
        double age = 1;
        calcer.setData(weight, height, age);
        double actual = calcer.calcWomanBMR();
        double expected = 455.60;
        assertEquals(expected, actual, 0.01);
    }
}
