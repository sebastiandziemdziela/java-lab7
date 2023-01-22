package pl.edu.wit.domain.airport;

import java.math.BigDecimal;

public class SampleWroAirport extends SampleAirport {

    public static final String AIRPORT_WRO_CODE = "WRO";
    public static final String AIRPORT_WRO_NAME = "Wrocław Nicolaus Copernicus Airport";
    public static final String AIRPORT_WRO_CITY = "Wrocław";
    public static final BigDecimal AIRPORT_WRO_AIRFARE = BigDecimal.valueOf(150.00);

    public static final Airport AIRPORT_WRO = createAirport(AIRPORT_WRO_CODE, AIRPORT_WRO_NAME, AIRPORT_WRO_CITY, AIRPORT_WRO_AIRFARE);

}