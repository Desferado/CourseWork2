package pro.sky.CourseWork2.Service;

import org.springframework.stereotype.Service;
import pro.sky.CourseWork2.Interface.QuestionService;
import pro.sky.CourseWork2.Model.Question;

import java.util.Collection;
import java.util.Random;

@Service
public class MathQuestionService implements QuestionService {
    private final MathQuestionRepository questions;

    public MathQuestionService(MathQuestionRepository questions) {
        this.questions = questions;
    }

    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        return  questions.add(question1);
    }

    @Override
    public Question add(Question question) {
        return questions.add(question);
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        int number = new Random().nextInt(questions.getAll().size() + 1);
        return questions.getAll().stream().toList().get(number);
    }
}
