package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.USerService;

public class Main {
    public static void main(String[] args) {

        // this app creates the Spring context, but it doesn't use the CommentService bean anywhere
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    }
}
