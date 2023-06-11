package pro.sky.CourseWork2.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static pro.sky.CourseWork2.ServiceConstances.*;


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
    void shouldGetQuestionWhenAddObjectQuestion() {
        assertEquals(question1, javaQuestionService.add(question1));
    }

    @Test
    void shouldGetQuestionWhenRemoveObjectQuestion() {
        assertEquals(question2, javaQuestionService.remove(question2));
    }

    @Test
    void shouldGetAll() {
        assertEquals(setQuestion, javaQuestionService.getAll());
    }
}