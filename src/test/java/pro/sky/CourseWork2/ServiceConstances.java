package pro.sky.CourseWork2;

import pro.sky.CourseWork2.Model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ServiceConstances {
    public static String q1 = "Question1";
    public static String a1 = "Answer1";
    public static String q2 = "Question2";
    public static String a2 = "Answer2";
    public static String q3 = "Question3";
    public static String a3 = "Answer3";
    public static Question question1 = new Question(q1,a1);
    public static Question question2 = new Question(q2,a2);
    public static Question question3 = new Question(q3,a3);
    public static Set<Question> setQuestion = new HashSet<>(Set.of(question2,question3));

    public static Set<Question> setQuestion1 = new HashSet<>(Set.of(question2));

}
