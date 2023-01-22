package pl.edu.wit.domain.airplane.seat;

import lombok.AllArgsConstructor;

import static lombok.AccessLevel.PRIVATE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static pl.edu.wit.domain.airplane.seat.SeatType.BUSINESS;
import static pl.edu.wit.domain.airplane.seat.SeatType.ECONOMY;
import static pl.edu.wit.domain.airplane.seat.SeatType.FIRST;

@AllArgsConstructor(access = PRIVATE)
@SuppressWarnings("UnusedReturnValue")
public class SeatAssertions {

    private final Seat subject;

    public static SeatAssertions createSeatAssertions(Seat subject) {
        return new SeatAssertions(subject);
    }

    public SeatAssertions assertBusinessClassSeat(String number) {
        assertSeat(BUSINESS, number);
        return this;
    }

    public SeatAssertions assertEconomyClassSeat(String number) {
        assertSeat(ECONOMY, number);
        return this;
    }

    public SeatAssertions assertFirstClassSeat(String number) {
        assertSeat(FIRST, number);
        return this;
    }

    private void assertSeat(final SeatType business, final String number) {
        assertNotNull(subject);
        assertEquals(business, subject.getType());
        assertEquals(number, subject.getNumber());
    }
}

