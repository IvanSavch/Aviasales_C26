package by.tms.aviasales_c26.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data

@Table(name = "Airport_Flight")

public class AirportFlight {


    private final String origin;
    private final String destination;
    private final Date departureDate;
    private final Date returnDate;
    private final Double price;

    public AirportFlight(String origin, String destination, Date departureDate, Date returnDate, Double price) {
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.price = price;
    }

    @Override
    public String toString() {
        return "start='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureDate=" + departureDate +
                ", returnDate=" + returnDate +
                ", price=" + price;
    }
}
