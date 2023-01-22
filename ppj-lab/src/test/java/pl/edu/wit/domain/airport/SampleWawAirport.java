package pl.edu.wit.domain.airport;

import java.math.BigDecimal;

public class SampleWawAirport extends SampleAirport {
    public static final String AIRPORT_WAW_CODE = "WAW";
    public static final String AIRPORT_WAW_NAME = "Lotnisko Chopina";
    public static final String AIRPORT_WAW_CITY = "Warszawa";
    public static final BigDecimal AIRPORT_WAW_AIRFARE = BigDecimal.valueOf(250.00);
    
    public static final Airport AIRPORT_WAW = createAirport(AIRPORT_WAW_CODE, AIRPORT_WAW_NAME, AIRPORT_WAW_CITY, AIRPORT_WAW_AIRFARE);

}