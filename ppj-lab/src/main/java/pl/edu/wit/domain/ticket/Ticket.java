package pl.edu.wit.domain.ticket;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import pl.edu.wit.domain.airplane.seat.Seat;
import pl.edu.wit.domain.flight.Flight;
import pl.edu.wit.domain.passenger.Passenger;

import static lombok.AccessLevel.PRIVATE;


@Data
@Builder
@RequiredArgsConstructor(access = PRIVATE)
public class Ticket {
    private final Flight flight;
    private final Passenger passenger;
    private final Seat seat;
}
