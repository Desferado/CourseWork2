package pro.sky.CourseWork2.Interface;

import pro.sky.CourseWork2.Model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestionJava(int amount);
    Collection<Question> getQuestionMath(int amount);
}
