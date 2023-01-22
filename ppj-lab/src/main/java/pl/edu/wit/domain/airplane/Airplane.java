package pl.edu.wit.domain.airplane;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import pl.edu.wit.domain.airplane.seat.Seat;
import pl.edu.wit.domain.airplane.seat.SeatType;

import java.util.Map;
import java.util.Set;

import static lombok.AccessLevel.PROTECTED;

@Data
@Builder(access = PROTECTED)
public class Airplane {
    private final String code;
    private final AirplaneType type;

    @Singular
    private final Set<Seat> seats;

    @Singular
    private final Map<SeatType, Float> priceModifiers;

}
