package pl.edu.wit.db;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import pl.edu.wit.domain.airplane.AirplaneRepository;

@Configuration
@Profile("memory")
class DatabaseAirplaneBeanConfiguration {

    @Bean
    @Scope("singleton")
    AirplaneRepository createDatabaseAirplaneRepository() {
        return new MemoryDatabaseAirplaneRepository();
    }
}
