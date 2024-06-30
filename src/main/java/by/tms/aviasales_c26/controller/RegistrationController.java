package by.tms.aviasales_c26.controller;

import by.tms.aviasales_c26.entity.User;
import by.tms.aviasales_c26.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/airport")
@Controller
public class RegistrationController {

    @Autowired
   private UserService userService;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }
    @PostMapping("/registration")
    public String registration(User user) {
        userService.save(user);
        return "home";
    }
}
