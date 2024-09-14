package your.package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LogicController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public RedirectView handleLogin(@RequestParam String userId, @RequestParam String password, @RequestParam String role) {
        boolean isAuthenticated = userService.authenticate(userId, password, role);

        if (isAuthenticated) {
            if ("student".equals(role)) {
                return new RedirectView("class");
            } else if ("instructor".equals(role)) {
                return new RedirectView("edit");
            }
        }
        return new RedirectView("login?error=Invalid credentials or role");
    }

    @PostMapping("/postComment")
    public RedirectView postComment(@RequestParam int lectureId, @RequestParam String userName, @RequestParam String comment) {
        userService.postComment(lectureId, userName, comment);
        return new RedirectView("class"); // or the relevant page
    }
}
