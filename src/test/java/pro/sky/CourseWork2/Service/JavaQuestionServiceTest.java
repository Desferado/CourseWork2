package pro.sky.CourseWork2.Service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.CourseWork2.ServiceConstances.*;


class JavaQuestionServiceTest {
    public JavaQuestionService javaQuestionService = new JavaQuestionService(setQuestion);

    @Test
    void shouldGetQuestionWhenAddQuestionAndAnswer() {
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