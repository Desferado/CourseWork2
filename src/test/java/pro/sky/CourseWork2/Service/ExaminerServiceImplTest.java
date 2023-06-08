package pro.sky.CourseWork2.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.CourseWork2.Model.Question;

import java.util.Collection;

import static pro.sky.CourseWork2.ServiceConstances.*;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private JavaQuestionService javaQuestionService;
    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @Test
    void shouldGetQuestion() {
        Mockito.when(javaQuestionService.getAll()).thenReturn(setQuestion);
        Mockito.when(javaQuestionService.getRandomQuestion()).thenReturn(question2);
        Collection<Question> expected = examinerService.getQuestion(1);
        System.out.println(expected);
        assertEquals(expected,setQuestion1);

    }
}