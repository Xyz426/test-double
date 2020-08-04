package mockito;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    private GradeSystem mock;
    private GradeService gradeService;
    @BeforeEach
    public void setUp(){
        mock = mock(GradeSystem.class);
        gradeService = new GradeService(mock);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        //Assertions.assertEquals(90.0, result);

        when(mock.gradesFor(anyLong())).thenReturn(Arrays.asList(80.0,90.0,100.0));

        double result = gradeService.calculateAverageGrades(3);
        assertEquals(result,90.0);
    }
}
