package pro.sky.CourseWork2.Service;

import org.junit.jupiter.api.Test;
import pro.sky.CourseWork2.Interface.QuestionRepository;
import pro.sky.CourseWork2.exceptions.AllreadyContainsException;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.CourseWork2.ServiceConstances.*;
class JavaQuestionRepositoryTest {
public QuestionRepository questionRepository = new JavaQuestionRepository(setQuestion);
    @Test
    void shouldGetQuestionObjectWhenAddQuestion() {
        assertEquals(question1,questionRepository.add(question1));
    }

    @Test
    void shouldGetQuestionWhenRemoveQuestion() {
        assertEquals(question2,questionRepository.remove(question2));
    }

    @Test
    void shouldGetAllQuestions() {
        assertEquals(setQuestion,questionRepository.getAll());
    }

    @Test
    void shouldGetExceptionWhenValidateQuestion() {
        assertThrows(AllreadyContainsException.class, () -> questionRepository.add(question3));
    }
}