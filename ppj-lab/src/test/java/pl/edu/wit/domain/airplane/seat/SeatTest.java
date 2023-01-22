package pl.edu.wit.domain.airplane.seat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static pl.edu.wit.domain.airplane.seat.SampleSeat.DEFAULT_SEAT_NUMBER;
import static pl.edu.wit.domain.airplane.seat.SeatAssertions.createSeatAssertions;

class SeatTest {

    @Test
    @DisplayName("should create business class seat")
    void shouldCreateBusinessSeat() {
        Seat businessClass = Seat.createBusinessClass(DEFAULT_SEAT_NUMBER);

        createSeatAssertions(businessClass)
                .assertBusinessClassSeat(DEFAULT_SEAT_NUMBER);
    }

    @Test
    @DisplayName("should create economy class seat")
    void shouldCreateEconomySeat() {
        Seat economyClass = Seat.createEconomyClass(DEFAULT_SEAT_NUMBER);

        createSeatAssertions(economyClass)
                .assertEconomyClassSeat(DEFAULT_SEAT_NUMBER);
    }

    @Test
    @DisplayName("should create first class seat")
    void shouldCreateFirstClassSeat() {
        Seat economyClass = Seat.createFirstClass(DEFAULT_SEAT_NUMBER);

        createSeatAssertions(economyClass)
                .assertFirstClassSeat(DEFAULT_SEAT_NUMBER);
    }


}