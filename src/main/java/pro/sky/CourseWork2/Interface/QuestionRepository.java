package pro.sky.CourseWork2.Interface;

import pro.sky.CourseWork2.Model.Question;

import java.util.Collection;

public interface QuestionRepository {
    void init();
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();

}
