package your.package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CommentRepository commentRepository;

    public boolean authenticate(String userId, String password, String role) {
        return userRepository.existsByUserIdAndPasswordAndRole(userId, password, role);
    }

    @Transactional
    public void postComment(int lectureId, String userName, String comment) {
        Comment newComment = new Comment(lectureId, userName, comment);
        commentRepository.save(newComment);
    }
}
