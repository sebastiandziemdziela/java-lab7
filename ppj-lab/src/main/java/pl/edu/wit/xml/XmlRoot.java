package pl.edu.wit.xml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class XmlRoot {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<XmlAirplane> airplane;
    @JacksonXmlElementWrapper
    private List<XmlAirport> airports;
}
