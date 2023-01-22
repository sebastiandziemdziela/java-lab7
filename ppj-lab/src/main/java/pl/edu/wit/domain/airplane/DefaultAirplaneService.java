package pl.edu.wit.domain.airplane;

import lombok.RequiredArgsConstructor;

import java.util.List;

import static lombok.AccessLevel.PROTECTED;

@RequiredArgsConstructor(access = PROTECTED)
public class DefaultAirplaneService implements AirplaneService {

    private final AirplaneRepository airplaneRepository;
    private final AirplaneFactoryStrategy factoryStrategy;

    @Override
    public Airplane createAirplane(AirplaneCreateCommand command) {
        AirplaneFactory factory = factoryStrategy.getAirplaneFactory(command.getType());
        Airplane airplane = factory.createAirplane(command.getCode(), command.getSeatCounts(), command.getSeatModifier());
        return airplaneRepository.save(airplane);
    }

    @Override
    public List<Airplane> findAirplanes() {
        return airplaneRepository.find();
    }
}
