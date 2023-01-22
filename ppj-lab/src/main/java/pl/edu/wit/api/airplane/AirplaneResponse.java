package pl.edu.wit.api.airplane;

import lombok.RequiredArgsConstructor;
import pl.edu.wit.domain.airplane.Airplane;
import pl.edu.wit.domain.airplane.AirplaneType;

import static lombok.AccessLevel.PROTECTED;

@RequiredArgsConstructor(access = PROTECTED, staticName = "of")
public class AirplaneResponse {

    private final Airplane airplane;


    public String getCode() {
        return airplane.getCode();
    }

    public AirplaneType getType() {
        return airplane.getType();
    }

    public int getSeatCounts() {
        return airplane.getSeats().size();
    }

}
