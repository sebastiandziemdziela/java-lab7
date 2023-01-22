package pl.edu.wit.domain.airplane;

import java.util.List;

public interface AirplaneRepository {
    Airplane save(Airplane airplane);

    List<Airplane> find();

}
