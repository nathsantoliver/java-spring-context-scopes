package services;

import org.springframework.beans.factory.annotation.Autowired;
import repositories.CommentRepository;


public class USerService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
