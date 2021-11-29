/*
* File: CalcerTest.java
* Author: Szivák Gergő
* Copyright: 2021, Szivák Gergő
* Group: Szoft II N
* Date: 2021-11-29.
* Github: https://github.com/Gergosz-2000/kalori
* Licenc: GNU GPL
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.assertThrows;

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
    @Test
    void exceptionWeightTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calcer.setData(0, 180, 20);
        });
        assertEquals("nem lehet 1-nél kissebb a testtömeg", 
        exception.getMessage());
    }
    @Test
    void exceptionHeightTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calcer.setData(80, 0, 20);
        });
        assertEquals("nem lehet 1-nél kissebb a magasság", 
        exception.getMessage());
    }
    @Test
    void exceptionAgeTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calcer.setData(80, 180, -1);
        });
        assertEquals("nem lehet 1-nél kissebb a kor", 
        exception.getMessage());
    }
}
