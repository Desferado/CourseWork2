package pro.sky.CourseWork2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.CourseWork2.Model.Question;
import pro.sky.CourseWork2.Interface.ExaminerService;

import java.util.Collection;

@RestController
public class ExamController {
       ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/exam")
    public Collection<Question> getQuestion(@RequestParam() int amount) {
        return examinerService.getQuestion(amount);
}
    
}
