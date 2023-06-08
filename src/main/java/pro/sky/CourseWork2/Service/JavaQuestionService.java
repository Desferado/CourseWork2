package pro.sky.CourseWork2.Service;

import org.springframework.stereotype.Service;
import pro.sky.CourseWork2.Interface.QuestionService;
import pro.sky.CourseWork2.Model.Question;
import pro.sky.CourseWork2.exceptions.AllreadyContainsException;
import pro.sky.CourseWork2.exceptions.NotContainsItemException;
import java.util.Random;
import java.util.Collection;
import java.util.Set;


@Service
public class JavaQuestionService implements QuestionService {
    private final Set<Question> questions;

    public JavaQuestionService(Set<Question> questions) {
        this.questions = questions;
    }

    @Override
    public Question add(String question, String answer) {
    Question question1 = new Question(question, answer);
    validateQuestion (question1);
    questions.add(question1);
    return question1;
    }

    @Override
    public Question add(Question question) {
    validateQuestion (question);
    questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
    if (questions.contains(question)){
        questions.remove(question);
    } else{
        throw new NotContainsItemException();
    }
    return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        int number = new Random().nextInt(questions.size() + 1);
        return questions.stream().toList().get(number);
    }
    public void validateQuestion (Question question){
        for (Question q:questions) {
            if  (q.equals(question)){
              throw new AllreadyContainsException();
            }
        }
    }
}
