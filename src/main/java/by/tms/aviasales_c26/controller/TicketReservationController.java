package by.tms.aviasales_c26.controller;

import by.tms.aviasales_c26.model.AirportFlight;
import by.tms.aviasales_c26.service.FlightDestinationService;
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
@RequestMapping("/ticketReservation")
public class TicketReservationController {
    @Autowired
    FlightDestinationService flightDestinationService;


    @GetMapping
    public String ticketReservation() {
        return "ticket_reservation";
    }

    @PostMapping
    public String ticketReservation(String origin, String destination, String departureDate, Model model) throws ResponseException {
        List<AirportFlight> flightDestinations = flightDestinationService.getFlightDestinations(origin, departureDate);
        List<AirportFlight> flight = new ArrayList<>();
        for (AirportFlight flightDestination : flightDestinations) {
            if (flightDestination.getDestination().equals(destination)) {
                flight.add(flightDestination);
            }
        }
        if (flight.isEmpty()) {
            return "redirect:/ticketReservationError";
        }

        model.addAttribute("flight", flight);
        return "/ticket_reservation";
    }
}
