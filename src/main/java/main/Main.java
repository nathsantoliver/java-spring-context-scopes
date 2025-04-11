package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.USerService;

public class Main {
    public static void main(String[] args) {

        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(USerService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();

        // because the dependency (CommentRepository) is singleton, both services contain the same reference
        System.out.println(b);

    }
}
