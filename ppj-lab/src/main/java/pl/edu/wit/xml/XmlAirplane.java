package pl.edu.wit.xml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

@Data
@JacksonXmlRootElement(localName = "airplane")
@JsonIgnoreProperties(ignoreUnknown = true)
public class XmlAirplane {
    @JacksonXmlProperty(isAttribute = true, localName = "mark")
    private String type;
    @JacksonXmlProperty(localName = "type")
    private String code;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<XmlSeat> seat;
}
