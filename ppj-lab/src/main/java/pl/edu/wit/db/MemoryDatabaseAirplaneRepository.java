package pl.edu.wit.db;

import pl.edu.wit.domain.airplane.Airplane;
import pl.edu.wit.domain.airplane.AirplaneRepository;

import java.util.ArrayList;
import java.util.List;

public class MemoryDatabaseAirplaneRepository implements AirplaneRepository {

    private final List<Airplane> airplanes = new ArrayList<>();


    @Override
    public Airplane save(Airplane airplane) {
        airplanes.add(airplane);
        return airplane;
    }

    @Override
    public List<Airplane> find() {
        return airplanes;
    }
}
