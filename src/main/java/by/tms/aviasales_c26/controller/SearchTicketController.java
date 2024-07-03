package by.tms.aviasales_c26.controller;

import by.tms.aviasales_c26.model.AirportFlight;
import by.tms.aviasales_c26.service.AirportFlightService;
import com.amadeus.exceptions.ResponseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/searchTicket")
public class SearchTicketController {
    @Autowired
    private AirportFlightService flightDestinationService;


    @GetMapping
    public String searchTicket() {
        return "search_ticket";
    }

    @PostMapping
    public String searchTicket(String origin, String destination, String departureDate, Model model) throws ResponseException {
        List<AirportFlight> flightDestinations = flightDestinationService.getFlightDestinations(origin, departureDate);
        List<AirportFlight> flight = new ArrayList<>();
        for (AirportFlight flightDestination : flightDestinations) {
            if (flightDestination.getDestination().equals(destination)) {
                flight.add(flightDestination);
            }
        }
        if (flight.isEmpty()) {
            return "redirect:/searchTicketError";
        }
        model.addAttribute("flight", flight);
        return "search_ticket";
    }
}
