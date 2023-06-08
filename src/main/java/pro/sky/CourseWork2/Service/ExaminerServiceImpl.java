package pro.sky.CourseWork2.Service;

import org.springframework.stereotype.Service;
import pro.sky.CourseWork2.Interface.ExaminerService;
import pro.sky.CourseWork2.Interface.QuestionService;
import pro.sky.CourseWork2.Model.Question;
import pro.sky.CourseWork2.exceptions.SetIndexOutOfBoundsException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private Random random;
    public QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {
        if (amount>questionService.getAll().size()){
            throw new SetIndexOutOfBoundsException();
        }
        Collection <Question> exam = new HashSet<>();
        for (int i = 0; i < amount ; i++) {
             exam.add(questionService.getRandomQuestion());
        }
        return exam;
    }
}
