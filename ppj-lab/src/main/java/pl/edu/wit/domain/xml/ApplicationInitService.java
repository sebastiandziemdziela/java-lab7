package pl.edu.wit.domain.xml;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.edu.wit.domain.airplane.AirplaneService;
import pl.edu.wit.xml.XmlRoot;
import pl.edu.wit.xml.XmlService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static lombok.AccessLevel.PROTECTED;

@Profile("init")
@Service
@RequiredArgsConstructor(access = PROTECTED)
public class ApplicationInitService {

    private final AirplaneService airplaneService;

    @EventListener(ApplicationReadyEvent.class)
    public void initDatabase() throws IOException {
        XmlService xmlService = new XmlService();
        File file = Path.of("C:\\Users\\nittu\\IdeaProjects\\wit\\D\\lab\\input.xml").toFile();
        XmlRoot xmlRoot = xmlService.parseXml(file);
        System.out.println(xmlRoot);
        xmlRoot.getAirplane().stream().map(AirplaneCreateCommandAdapter::new)
                .forEach(airplaneService::createAirplane);

    }
}
