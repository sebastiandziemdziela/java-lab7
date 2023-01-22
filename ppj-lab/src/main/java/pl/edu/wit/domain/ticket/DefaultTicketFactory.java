package pl.edu.wit.domain.ticket;

import pl.edu.wit.domain.airplane.seat.Seat;
import pl.edu.wit.domain.flight.Flight;
import pl.edu.wit.domain.passenger.Passenger;

class DefaultTicketFactory implements TicketFactory {

    @Override
    public Ticket createTicket(final Flight flight, final Seat seat) {
        return Ticket.builder()
                .flight(flight)
                .seat(seat)
                .build();
    }

    @Override
    public Ticket createTicket(Flight flight, Passenger passenger, Seat seat) {
        return Ticket.builder()
                .flight(flight)
                .passenger(passenger)
                .seat(seat)
                .build();
    }

    @Override
    public Ticket createBusinessTicket(Flight flight, Passenger passenger, String seatNumber) {
        Seat seat = Seat.createBusinessClass(seatNumber);
        return createTicket(flight, passenger, seat);
    }
}
