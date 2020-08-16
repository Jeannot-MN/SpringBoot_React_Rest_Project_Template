package app;

import app.domain.data.User;
import app.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeder implements CommandLineRunner {

    private final UserRepository userRepository;

    @Autowired
    public Seeder(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();

        user.setFirstName("Jeannot");
        user.setLastName("MUnganga");

        userRepository.save(user);
    }
}
