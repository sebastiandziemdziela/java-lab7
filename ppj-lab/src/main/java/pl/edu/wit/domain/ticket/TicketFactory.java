package pl.edu.wit.domain.ticket;

import pl.edu.wit.domain.airplane.seat.Seat;
import pl.edu.wit.domain.flight.Flight;
import pl.edu.wit.domain.passenger.Passenger;

public interface TicketFactory {
    Ticket createTicket(Flight flight, Seat seat);

    Ticket createTicket(Flight flight, Passenger passenger, Seat seat);

    Ticket createBusinessTicket(Flight flight, Passenger passenger, String seatNumber);
}
