package by.tms.aviasales_c26.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/searchTicketError")
public class SearchTicketErrorController {
    @GetMapping
    public String searchTicketError(Model model) {
        model.addAttribute("nonFlights", "no flights found");
        return "searchTicketError";
    }
}
