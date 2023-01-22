package pl.edu.wit.domain.flight;

import lombok.Data;
import pl.edu.wit.domain.airplane.Airplane;
import pl.edu.wit.domain.airplane.seat.Seat;
import pl.edu.wit.domain.airport.Airport;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

@Data(staticConstructor = "create")
public class Flight {
    private final Airport from;
    private final Airport to;
    private final Airplane airplane;
    private final LocalDateTime date;
    private final LocalTime boarding;
    private final BigDecimal baseCost;
    private final String number;
    private final Set<Seat> takenSeats;

}
