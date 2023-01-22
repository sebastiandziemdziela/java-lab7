package pl.edu.wit.domain.flight;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static pl.edu.wit.domain.airplane.SampleBoeingAirplane.AIRPLANE_BOEING;
import static pl.edu.wit.domain.airplane.SampleBoeingAirplane.AIRPLANE_BOEING_TAKEN_SEATS;
import static pl.edu.wit.domain.airport.SampleWawAirport.AIRPORT_WAW;
import static pl.edu.wit.domain.airport.SampleWroAirport.AIRPORT_WRO;

public class SampleWawToWroFlight {

    public static final String FLIGHT_WAW_WRO_BOEING_NUMBER = "ABC-100";
    public static final LocalDateTime FLIGHT_WAW_WRO_BOEING_DATE = LocalDateTime.of(2022, 3, 14, 20, 50, 0);
    public static final LocalTime FLIGHT_WAW_WRO_BOEING_BOARDING = LocalTime.of(20, 0, 0);
    public static final BigDecimal FLIGHT_WAW_WRO_BOEING_BASE_CONST = BigDecimal.valueOf(100.0);

    public static final Flight WAW_WRO_BOEING_FLIGHT = Flight.create(
            AIRPORT_WAW,
            AIRPORT_WRO,
            AIRPLANE_BOEING,
            FLIGHT_WAW_WRO_BOEING_DATE,
            FLIGHT_WAW_WRO_BOEING_BOARDING,
            FLIGHT_WAW_WRO_BOEING_BASE_CONST,
            FLIGHT_WAW_WRO_BOEING_NUMBER,
            AIRPLANE_BOEING_TAKEN_SEATS
    );


}