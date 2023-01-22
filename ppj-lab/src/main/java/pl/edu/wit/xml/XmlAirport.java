package pl.edu.wit.xml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class XmlAirport {
    private String code;

    @JacksonXmlElementWrapper(useWrapping = false)
    private Set<XmlLocalAirportName> name;

    private BigDecimal price;

    @Data
    private static class XmlLocalAirportName {
        @JacksonXmlProperty(isAttribute = true, localName = "lang")
        private String country;
        @JacksonXmlText
        private String name;
    }
}
