package by.tms.aviasales_c26.service;

import by.tms.aviasales_c26.constant.AirportConstants;
import by.tms.aviasales_c26.model.AirportFlight;
import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightDestination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportFlightService {



    private final Amadeus amadeus = Amadeus.builder(AirportConstants.Client_id, AirportConstants.Client_key).build();

    public List<AirportFlight> getFlightDestinations(String origin, String departureDate) throws ResponseException {
        List<AirportFlight> flights = new ArrayList<>();
        Params params = Params.with("origin", origin).and("departureDate", departureDate);
        FlightDestination[] flightDestinations = amadeus.shopping.flightDestinations.get(params);
        for (FlightDestination flightDestination : flightDestinations) {
            flights.add(new AirportFlight(flightDestination.getOrigin()
                    ,flightDestination.getDestination(),
                    flightDestination.getDepartureDate(),
                    flightDestination.getReturnDate(),
                    flightDestination.getPrice().getTotal()));
        }
        return flights;
    }

}
