package pl.edu.wit.domain.passenger.document;

import lombok.Data;

import java.time.LocalDate;

import static java.util.Objects.nonNull;

@Data(staticConstructor = "create")
public class Document {

    private final LocalDate expireAt;
    private final String number;
    private final LocalDate issueAt;

    private Document(final LocalDate expireAt, final String number, final LocalDate issueAt) {
        if (nonNull(expireAt) && issueAt.isAfter(expireAt)) {
            throw new IllegalStateException("date issue at cannot be after expiration date");
        }
        this.expireAt = expireAt;
        this.number = number;
        this.issueAt = issueAt;
    }

    public static Document create(String number, LocalDate issueAt) {
        return new Document(null, number, issueAt);
    }
}
