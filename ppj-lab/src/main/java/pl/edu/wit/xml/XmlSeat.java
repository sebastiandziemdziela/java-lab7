package pl.edu.wit.xml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import pl.edu.wit.domain.airplane.seat.SeatType;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class XmlSeat {
    private SeatType type;
    private int count;
    @JacksonXmlProperty(localName = "price")
    private BigDecimal modifier;
}
