package by.tms.aviasales_c26.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class AirportFlight {
    private  String origin;
    private  String destination;
    private  Date departureDate;
    private  Date returnDate;
    private  Double price;


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
