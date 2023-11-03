package dk.kea.project.User;

import dk.kea.security.entity.UserWithRoles;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "USER_TYPE")
public class User extends UserWithRoles {
    private String firstName;
    private String lastName;
    public User(String username, String email, String password, String firstName, String lastName){
        super(username, password, email);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
