package pro.sky.CourseWork2.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static pro.sky.CourseWork2.ServiceConstances.*;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {
    @Mock
    public JavaQuestionRepository javaQuestionRepository;

    @InjectMocks
    public JavaQuestionService javaQuestionService;

    @Test
    void shouldGetQuestionWhenAddQuestionAndAnswer() {
        given(javaQuestionRepository.add(question1)).willReturn(question1);
        assertEquals(question1, javaQuestionService.add(q1,a1));
    }
    @Test
    void shouldGetQuestionWhenAddQuestionObject() {
        given(javaQuestionRepository.add(question1)).willReturn(question1);
        assertEquals(question1, javaQuestionService.add(question1));
    }

    @Test
    void shouldGetQuestionWhenRemoveObjectQuestion() {
        given(javaQuestionRepository.remove(question1)).willReturn(question1);
        assertEquals(question1, javaQuestionService.remove(question1));
    }

    @Test
    void shouldGetAll() {
        given(javaQuestionRepository.getAll()).willReturn(setQuestion);
        assertEquals(setQuestion,javaQuestionService.getAll());
    }
}