package pro.sky.CourseWork2.Controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.CourseWork2.Model.Question;
import pro.sky.CourseWork2.Interface.ExaminerService;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class ExamController {
   ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/exam")
    public Collection<Question> getQuestion(@Qualifier("javaQuestionService") int amountJava,
                                            @Qualifier("mathQuestionService") int amountMath) {
        Collection<Question> java =  examinerService.getQuestionJava(amountJava);
        Collection<Question> math = examinerService.getQuestionMath(amountMath);
        return Stream.of(java, math).flatMap(Collection::stream).collect(Collectors.toList());
}
    
}
