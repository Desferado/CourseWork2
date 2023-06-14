package pro.sky.CourseWork2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.CourseWork2.Interface.ExaminerService;
import pro.sky.CourseWork2.Interface.QuestionService;
import pro.sky.CourseWork2.Model.Question;
import pro.sky.CourseWork2.exceptions.SetIndexOutOfBoundsException;

import java.util.Collection;
import java.util.HashSet;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    public QuestionService javaQuestionService;
    public QuestionService mathQuestionService;
@Autowired
    public ExaminerServiceImpl(@Qualifier("javaQuestionService") QuestionService javaQuestionService,
                               @Qualifier ("mathQuestionService") QuestionService mathQuestionService) {
        this.javaQuestionService = javaQuestionService;
        this.mathQuestionService = mathQuestionService;
    }

    @Override
    public Collection<Question> getQuestionJava(int amount) {
        return getQuestions(amount, javaQuestionService);
    }
    @Override
    public Collection<Question> getQuestionMath(int amount) {
        return getQuestions(amount, mathQuestionService);
    }

    private Collection<Question> getQuestions(int amount, QuestionService questionService) {
        if (amount> questionService.getAll().size()){
            throw new SetIndexOutOfBoundsException();
        }
        Collection <Question> exam = new HashSet<>();
        while (exam.size() < amount) {
            exam.add(questionService.getRandomQuestion());
        }
        return exam;
    }
}
