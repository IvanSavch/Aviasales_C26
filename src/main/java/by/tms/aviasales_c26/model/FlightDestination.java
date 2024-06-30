package by.tms.aviasales_c26.model;

import lombok.Data;

import java.util.Date;
@Data
public class FlightDestination {
    private String type;
    private String origin;
    private String destination;
    private Date departureDate;
    private Date returnDate;
    private Double price;
}
