package by.tms.aviasales_c26.service;

import by.tms.aviasales_c26.constant.AirportConstants;
import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightDestination;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class FlightDestinationService {
    private final Amadeus amadeus = Amadeus.builder(AirportConstants.Client_id,AirportConstants.Client_key).build();


    public FlightDestination[] getFlightDestinations(String origin, String destination) throws ResponseException {
         Params params = Params.with("origin",origin).and("destination",destination);
         FlightDestination[] flightDestinations = amadeus.shopping.flightDestinations.get(params);
         return flightDestinations;
    }

}
