package pro.sky.CourseWork2.Service;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.CourseWork2.Interface.QuestionService;
import pro.sky.CourseWork2.Model.Question;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static pro.sky.CourseWork2.ServiceConstances.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private QuestionService questionService;
    @InjectMocks
    private ExaminerServiceImpl examinerService;
    @Test
    void shouldGetQuestion() {
        given(questionService.getAll()).willReturn(setQuestion1);
        given(questionService.getRandomQuestion()).willReturn(question2);
        Collection<Question> expected = examinerService.getQuestionJava(1);
        assertEquals(expected,setQuestion1);
    }
}