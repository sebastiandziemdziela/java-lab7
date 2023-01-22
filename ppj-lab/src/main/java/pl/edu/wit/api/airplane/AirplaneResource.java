package pl.edu.wit.api.airplane;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.wit.domain.airplane.AirplaneService;

import java.util.List;
import java.util.stream.Collectors;

import static lombok.AccessLevel.PACKAGE;

@RestController
@RequestMapping("/airplane")
@RequiredArgsConstructor(access = PACKAGE)
public class AirplaneResource {

    private final AirplaneService service;

    @GetMapping
    List<AirplaneResponse> findAirplanes() {
        return service.findAirplanes().stream().map(AirplaneResponse::of).collect(Collectors.toList());
    }
}

