package pl.edu.wit.domain.airplane;

import pl.edu.wit.domain.airplane.seat.Seat;
import pl.edu.wit.domain.airplane.seat.SeatType;

import java.util.Map;
import java.util.Set;

import static pl.edu.wit.domain.airplane.AirplaneType.BOEING;
import static pl.edu.wit.domain.airplane.seat.SampleSeat.creatEconomyClass;
import static pl.edu.wit.domain.airplane.seat.SampleSeat.createBusinessClass;
import static pl.edu.wit.domain.airplane.seat.SampleSeat.getSeats;
import static pl.edu.wit.domain.airplane.seat.SeatType.BUSINESS;
import static pl.edu.wit.domain.airplane.seat.SeatType.ECONOMY;
import static pl.edu.wit.domain.airplane.seat.SeatType.FIRST;

public class SampleBoeingAirplane extends SampleAirplane {

    public static final String AIRPLANE_BOEING_CODE = "747-100";
    public static final AirplaneType AIRPLANE_BOEING_TYPE = BOEING;
    public static final Map<SeatType, Integer> AIRPLANE_BOEING_SEAT_COUNT = Map.of(ECONOMY, 100, BUSINESS, 20, FIRST, 10);
    public static final Set<Seat> AIRPLANE_BOEING_SEATS = getSeats(100, 20, 10, "", "E", "B", "F");
    public static final Map<SeatType, Float> AIRPLANE_BOEING_PRICES = Map.ofEntries(
            Map.entry(ECONOMY, 1.0F),
            Map.entry(BUSINESS, 1.2F),
            Map.entry(FIRST, 1.4F)
    );
    public static final Set<Seat> AIRPLANE_BOEING_TAKEN_SEATS = Set.of(
            createBusinessClass("B5"),
            createBusinessClass("B10"),
            creatEconomyClass("E14"),
            creatEconomyClass("E16"),
            creatEconomyClass("E15")
    );

    public static final Airplane AIRPLANE_BOEING = createAirplane(AIRPLANE_BOEING_CODE, AIRPLANE_BOEING_TYPE, AIRPLANE_BOEING_SEATS, AIRPLANE_BOEING_PRICES);

}