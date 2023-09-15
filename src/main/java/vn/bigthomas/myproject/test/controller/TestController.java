package vn.bigthomas.myproject.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vn.bigthomas.myproject.test.enity.User;
import vn.bigthomas.myproject.test.repository.UserRepository;
import vn.bigthomas.myproject.test.service.Greeting;

import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping(path = "/demo")
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) throws Exception {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() throws Exception {
        return userRepository.findAll();
    }
}
