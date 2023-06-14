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
public class MathQuestionRepository implements QuestionRepository {
    private Set<Question> mathQuestions;

    public MathQuestionRepository(Set<Question> mathQuestions) {
        this.mathQuestions = mathQuestions;
    }


    @PostConstruct
    @Override
    public void init(){
        Question question1 = new Question("QuestionMath1", "AnswerMath1");
        Question question2 = new Question("QuestionMath2", "AnswerMath2");
        Question question3 = new Question("QuestionMath3", "AnswerMath3");
        Question question4 = new Question("QuestionMath4", "AnswerMath4");
        mathQuestions = new HashSet<>(Set.of(question1, question2, question3,question4));
    }

    @Override
    public Question add(Question question) {
        validateQuestion (question);
        mathQuestions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (mathQuestions.contains(question)){
            mathQuestions.remove(question);
        } else{
            throw new NotContainsItemException();
        }
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return mathQuestions;
    }


    public void validateQuestion (Question question){
        for (Question q: mathQuestions) {
            if  (q.equals(question)){
                throw new AllreadyContainsException();
            }
        }
    }
}
