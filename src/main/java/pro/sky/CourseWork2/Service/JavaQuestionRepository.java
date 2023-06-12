package pro.sky.CourseWork2.Service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import pro.sky.CourseWork2.Interface.QuestionRepository;
import pro.sky.CourseWork2.Model.Question;
import pro.sky.CourseWork2.exceptions.AllreadyContainsException;
import pro.sky.CourseWork2.exceptions.NotContainsItemException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
@Repository
public class JavaQuestionRepository implements QuestionRepository {
    private Set<Question> javaQuestions;

    public JavaQuestionRepository(Set<Question> javaQuestions) {
        this.javaQuestions = javaQuestions;
    }
    @PostConstruct
    @Override
    public void init() {
        Question question1 = new Question("QuestionJava1", "AnswerJava1");
        Question question2 = new Question("QuestionJava2", "AnswerJava2");
        Question question3 = new Question("QuestionJava3", "AnswerJava3");
        Question question4 = new Question("QuestionJava4", "AnswerJava4");
        javaQuestions = new HashSet<>(Set.of(question1, question2, question3,question4));
    }

    @Override
    public Question add(Question question) {
        validateQuestion (question);
        javaQuestions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (javaQuestions.contains(question)){
            javaQuestions.remove(question);
        } else{
            throw new NotContainsItemException();
        }
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return javaQuestions;
    }

    public void validateQuestion (Question question){
        for (Question q: javaQuestions) {
            if  (q.equals(question)){
                throw new AllreadyContainsException("Already added");
            }
        }
    }
}
