package pl.edu.wit.domain.airplane.seat;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import static lombok.AccessLevel.PRIVATE;
import static pl.edu.wit.domain.airplane.seat.SeatType.BUSINESS;
import static pl.edu.wit.domain.airplane.seat.SeatType.ECONOMY;
import static pl.edu.wit.domain.airplane.seat.SeatType.FIRST;

@Data
@RequiredArgsConstructor(access = PRIVATE)
public class Seat {
    private final SeatType type;
    private final String number;

    public static Seat createBusinessClass(String number) {
        return new Seat(BUSINESS, number);
    }

    public static Seat createFirstClass(String number) {
        return new Seat(FIRST, number);
    }

    public static Seat createEconomyClass(String number) {
        return new Seat(ECONOMY, number);
    }

    public static Seat of (SeatType type, String number) {
        return switch (type) {
            case ECONOMY -> createEconomyClass(number);
            case FIRST -> createFirstClass(number);
            case BUSINESS -> createBusinessClass(number);
        };
    }
}
