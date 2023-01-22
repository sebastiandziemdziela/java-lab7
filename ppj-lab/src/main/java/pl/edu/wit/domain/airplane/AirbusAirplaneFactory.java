package pl.edu.wit.domain.airplane;

import pl.edu.wit.domain.airplane.seat.Seat;
import pl.edu.wit.domain.airplane.seat.SeatType;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static pl.edu.wit.domain.airplane.AirplaneType.AIRBUS;

class AirbusAirplaneFactory implements AirplaneFactory {

    @Override
    public Airplane createAirplane(String code, Map<SeatType, Integer> seats, Map<SeatType, Float> priceModifiers) {
        return Airplane.builder()
                .code(code)
                .type(AIRBUS)
                .seats(createSeats(seats))
                .priceModifiers(priceModifiers)
                .build();
    }

    private Set<Seat> createSeats(Map<SeatType, Integer> seats) {
        return seats.entrySet().stream()
                .flatMap(entry -> createSeats(entry.getKey(), entry.getValue()))
                .collect(Collectors.toSet());
    }

    private Stream<Seat> createSeats(SeatType type, int count) {
        return IntStream.range(1, count + 1)
                .mapToObj(value -> switch (type) {
                    case FIRST -> Seat.createFirstClass("AF" + value);
                    case BUSINESS -> Seat.createBusinessClass("AB" + value);
                    case ECONOMY -> Seat.createEconomyClass("AE" + value);
                });
    }


}
