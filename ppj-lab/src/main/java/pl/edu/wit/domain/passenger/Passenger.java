package pl.edu.wit.domain.passenger;

import lombok.Data;
import pl.edu.wit.domain.passenger.document.Document;

import java.time.LocalDate;

@Data(staticConstructor = "create")
public class Passenger {
    private final String id;
    private final String name;
    private final String lastName;
    private final Document document;

    public static Passenger create(String id, String name, String lastName, String documentNumber, LocalDate expireAt, LocalDate issueAt) {
        Document document = Document.create(expireAt, documentNumber, issueAt);
        return create(id, name, lastName, document);
    }
}
