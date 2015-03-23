package demo;

import static  org.junit.Assert.*;
import org.junit.Test;

public class GradeConverterTest {

    GradeConverter converter = new GradeConverter();

    @Test
    public void shouldShowGradeAWhenStudentHaveScore80() {
        String actualGrade = converter.convert(80);
        assertEquals("A", actualGrade);
    }

    @Test
    public void shouldShowGradeBWhenStudentHaveScore70() {
        String actualGrade = converter.convert(70);
        assertEquals("B", actualGrade);
    }

    @Test
    public void shouldShowGradeCWhenStudentHaveScore60() {
        String actualGrade = converter.convert(60);
        assertEquals("C", actualGrade);
    }

    @Test
    public void shouldShowGradeDWhenStudentHaveScore50() {
        String actualGrade = converter.convert(50);
        assertEquals("D", actualGrade);
    }

    @Test
    public void shouldShowGradeFWhenStudentHaveScore40() {
        String actualGrade = converter.convert(40);
        assertEquals("F", actualGrade);
    }

}
