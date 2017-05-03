package docker.controllers;

import docker.model.User;
import docker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by viacheslav on 5/3/17.
 */
@RestController
public class UserController {

    private UserRepository repository;

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/create/{name}")
    public String createUser(@PathVariable(name = "name") String name) {
        User user = new User(name);
        User savedUser = repository.save(user);
        return savedUser != null ? "user has been created" : "error creating user";
    }
}
