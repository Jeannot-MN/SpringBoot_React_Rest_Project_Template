package app.rest;

import app.domain.data.User;
import app.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/")
public class AppController {

    private final UserRepository userRepository;

    @Autowired
    public AppController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "helloworld")
    private String helloWorld(){
        return "Hello World";
    }

    @GetMapping(value = "users")
    private List<User> getUsers(){
        return userRepository.findAll();
    }

}
