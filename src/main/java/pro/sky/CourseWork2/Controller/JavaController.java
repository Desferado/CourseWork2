package pro.sky.CourseWork2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.CourseWork2.Interface.QuestionService;
import pro.sky.CourseWork2.Model.Question;


import java.util.Collection;

@RestController

@RequestMapping("/exam/java")
public class JavaController {
    QuestionService service;
    public JavaController(QuestionService service) {
        this.service = service;
    }

    @GetMapping()
    public Collection<Question> getQuestion (){
        return service.getAll();
    }

    @GetMapping("/add")
    public Question addQuestion (@RequestParam() String question,@RequestParam() String answer){
    return service.add(question,answer);
}
    @GetMapping("/remove")
    public Question removeQuestion (@RequestParam() String question, @RequestParam() String answer){
        Question question1 = new Question(question,answer);
        return service.remove(question1);
    }

}
