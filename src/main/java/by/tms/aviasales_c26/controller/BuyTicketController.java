package by.tms.aviasales_c26.controller;

import by.tms.aviasales_c26.model.AirportFlight;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/buy")
public class BuyTicketController {


    @GetMapping
    public String buyTicket() {
        return "buy_ticket";
    }

    @GetMapping("/check")
    public String check(Model model) {
        model.addAttribute("success","success");
        return "chek";
    }

    @PostMapping
    public String buyTicket(AirportFlight fli, Model model) {
        model.addAttribute("buyTicket", fli);
        return "buy_ticket";
    }
}
