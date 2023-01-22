package pl.edu.wit.domain.airplane;

import java.util.List;

public interface AirplaneService {

    Airplane createAirplane(AirplaneCreateCommand command);

    List<Airplane> findAirplanes();
}
