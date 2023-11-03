package dk.kea.project.config;

import dk.kea.project.User.User;
import dk.kea.project.repository.UserRepository;
import dk.kea.security.entity.Role;

import javax.management.relation.RoleUnresolvedList;

public class DeveloperData {
    UserRepository userRepository;

    public DeveloperData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    User admin = new User("admin", "admin@admin", "password123", "firstName", "lastName");
    admin.addRole(Role.USER);
    userRepository.save(admin);

    User user = new User("user", "user@user", "password123", "firstName", "lastName");
    user.addRole(Role.ADMIN);
    userRepository.save(user);
}
