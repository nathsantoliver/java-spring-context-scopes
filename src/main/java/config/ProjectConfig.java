package config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import services.CommentService;

@Configurable
public class ProjectConfig {

    @Bean
    public CommentService commentService() {
        return new CommentService();
    }

}
