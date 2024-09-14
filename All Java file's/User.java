package your.package;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Integer id;
    private String userId;
    private String password;
    private String role;

    // Getters and Setters
}
