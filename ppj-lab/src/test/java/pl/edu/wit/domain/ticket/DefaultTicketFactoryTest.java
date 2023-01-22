package pl.edu.wit.domain.ticket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.edu.wit.domain.airplane.seat.SampleSeat;
import pl.edu.wit.domain.airplane.seat.Seat;
import pl.edu.wit.domain.flight.Flight;
import pl.edu.wit.domain.flight.SampleWawToWroFlight;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static pl.edu.wit.domain.airplane.seat.SampleSeat.DEFAULT_SEAT_NUMBER;
import static pl.edu.wit.domain.airplane.seat.SeatAssertions.createSeatAssertions;

@DisplayName("default ticket factory test")
class DefaultTicketFactoryTest {

    private TicketFactory subject;

    @BeforeEach
    void setupTests() {
        subject = new DefaultTicketFactory();
    }

    @Test
    @DisplayName("should create ticket")
    void shouldCreateTicket() {
        // given
        Flight flight = SampleWawToWroFlight.WAW_WRO_BOEING_FLIGHT;
        Seat seat = SampleSeat.SAMPLE_BUSINESS_SEAT;

        // when
        Ticket ticket = subject.createTicket(flight, seat);

        // then
        assertNotNull(ticket);
        assertEquals(SampleWawToWroFlight.WAW_WRO_BOEING_FLIGHT, ticket.getFlight());
        
        createSeatAssertions(ticket.getSeat())
                .assertBusinessClassSeat(DEFAULT_SEAT_NUMBER);
    }
}