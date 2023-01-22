package pl.edu.wit.domain.airplane;

import pl.edu.wit.domain.airplane.seat.SeatType;

import java.util.Map;

public interface AirplaneFactory {
    Airplane createAirplane(String code, Map<SeatType, Integer> seats, Map<SeatType, Float> priceModifiers);
}
