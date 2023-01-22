package pl.edu.wit.domain.airplane;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static lombok.AccessLevel.PROTECTED;

@Configuration
@RequiredArgsConstructor(access = PROTECTED)
public class AirplaneBeanConfiguration {

    private final AirplaneRepository repository;

    @Bean
    AirplaneService createAirplaneService() {
        AirplaneFactoryStrategy factoryStrategy = new AirplaneFactoryStrategy();
        return new DefaultAirplaneService(repository, factoryStrategy);
    }
}
