package pro.sky.CourseWork2.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static pro.sky.CourseWork2.ServiceConstances.*;
import static pro.sky.CourseWork2.ServiceConstances.setQuestion;

@ExtendWith(MockitoExtension.class)
class MathQuestionServiceTest {
    @Mock
    public MathQuestionRepository mathQuestionRepository;
    @InjectMocks
    public MathQuestionService mathQuestionService;
    @Test
    void shouldGetQuestionWhenAddQuestionAndAnswer() {
        given(mathQuestionRepository.add(question1)).willReturn(question1);
        assertEquals(question1, mathQuestionService.add(q1,a1));
    }
    @Test
    void shouldGetQuestionWhenAddQuestionObject() {
        given(mathQuestionRepository.add(question1)).willReturn(question1);
        assertEquals(question1, mathQuestionService.add(question1));
    }

    @Test
    void shouldGetQuestionWhenRemoveObjectQuestion() {
        given(mathQuestionRepository.remove(question1)).willReturn(question1);
        assertEquals(question1, mathQuestionService.remove(question1));
    }

    @Test
    void shouldGetAll() {
        given(mathQuestionRepository.getAll()).willReturn(setQuestion);
        assertEquals(setQuestion,mathQuestionService.getAll());
    }
}