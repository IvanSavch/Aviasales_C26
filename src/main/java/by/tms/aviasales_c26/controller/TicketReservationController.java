package by.tms.aviasales_c26.controller;

import by.tms.aviasales_c26.service.FlightDestinationService;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightDestination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/TicketReservation")
public class TicketReservationController {
    @Autowired
    FlightDestinationService flightDestinationService;


    @GetMapping
    public String ticketReservation() {
        return "ticket_reservation";
    }

    @PostMapping
    public String ticketReservation(String origin, String destination, String departureDate, String returnDate, Model model) {
        try {
            FlightDestination[] flightDestinations = flightDestinationService.getFlightDestinations(origin, destination);

        } catch (ResponseException e) {
            throw new RuntimeException(e);
        }
        return "catalog";
    }
}
