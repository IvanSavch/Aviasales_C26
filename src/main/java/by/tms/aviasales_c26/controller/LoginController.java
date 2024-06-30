package by.tms.aviasales_c26.controller;

import by.tms.aviasales_c26.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/airport")
public class LoginController {
    @GetMapping("login")
    public String login() {
        return "login";
    }
    @PostMapping("login")
    public String login(User user) {
        return "ticket_reservation";
    }
}
