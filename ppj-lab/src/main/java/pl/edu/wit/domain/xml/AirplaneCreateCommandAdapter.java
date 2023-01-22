package pl.edu.wit.domain.xml;

import pl.edu.wit.domain.airplane.AirplaneCreateCommand;
import pl.edu.wit.domain.airplane.AirplaneType;
import pl.edu.wit.domain.airplane.seat.SeatType;
import pl.edu.wit.xml.XmlAirplane;
import pl.edu.wit.xml.XmlSeat;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AirplaneCreateCommandAdapter extends AirplaneCreateCommand {

    private final XmlAirplane airplane;

    protected AirplaneCreateCommandAdapter(XmlAirplane xmlAirplane) {
        super(AirplaneType.valueOf(xmlAirplane.getType()), xmlAirplane.getCode(), new HashMap<>());
        this.airplane = xmlAirplane;
        overrideSeatDefinitions();
    }

    private void overrideSeatDefinitions() {
        Map<SeatType, SeatDefinition> collect = airplane.getSeat().stream().collect(
                Collectors.toMap(
                        XmlSeat::getType,
                        xmlSeat -> SeatDefinition.of(xmlSeat.getCount(), xmlSeat.getModifier().floatValue())
                )
        );
        super.getSeatDefinitions().putAll(collect);
    }

}
