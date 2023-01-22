package pl.edu.wit.domain.airport;

import lombok.Data;

import java.math.BigDecimal;

@Data(staticConstructor = "create")
public class Airport {
    private final String code;
    private final String name;
    private final String city;
    private final BigDecimal airfare;
}
