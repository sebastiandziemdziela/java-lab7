
package pl.edu.wit.domain.airplane;

import pl.edu.wit.domain.airplane.seat.Seat;
import pl.edu.wit.domain.airplane.seat.SeatType;

import java.util.Map;
import java.util.Set;

class SampleAirplane {

    public static Airplane createAirplane(String code, AirplaneType type, Set<Seat> seats, Map<SeatType, Float> priceModifiers) {
        return Airplane.builder().code(code).type(type).seats(seats).priceModifiers(priceModifiers).build();
    }

}