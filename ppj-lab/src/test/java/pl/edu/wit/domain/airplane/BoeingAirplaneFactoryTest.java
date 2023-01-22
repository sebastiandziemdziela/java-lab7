package pl.edu.wit.domain.airplane;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.edu.wit.domain.airplane.SampleBoeingAirplane.AIRPLANE_BOEING_CODE;
import static pl.edu.wit.domain.airplane.SampleBoeingAirplane.AIRPLANE_BOEING_PRICES;
import static pl.edu.wit.domain.airplane.SampleBoeingAirplane.AIRPLANE_BOEING_SEATS;
import static pl.edu.wit.domain.airplane.SampleBoeingAirplane.AIRPLANE_BOEING_SEAT_COUNT;
import static pl.edu.wit.domain.airplane.SampleBoeingAirplane.AIRPLANE_BOEING_TYPE;

@DisplayName("airplane default factory tests")
class BoeingAirplaneFactoryTest {

    private final AirplaneFactory subject = new BoeingAirplaneFactory();

    @Test
    @DisplayName("should create default airplane")
    void shouldCreateBoeingAirplane() {

        Airplane boeing = subject.createAirplane(AIRPLANE_BOEING_CODE, AIRPLANE_BOEING_SEAT_COUNT, AIRPLANE_BOEING_PRICES);

        assertNotNull(boeing);
        assertEquals(AIRPLANE_BOEING_CODE, boeing.getCode());
        assertEquals(AIRPLANE_BOEING_TYPE, boeing.getType());
        assertEquals(AIRPLANE_BOEING_PRICES, boeing.getPriceModifiers());
    }
}