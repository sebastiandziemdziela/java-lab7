package pl.edu.wit.domain.passenger.document;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static pl.edu.wit.domain.passenger.document.SampleDefaultDocument.DEFAULT_DOCUMENT_EXPIRATION_DATE;
import static pl.edu.wit.domain.passenger.document.SampleDefaultDocument.DEFAULT_DOCUMENT_ISSUE_DATE;
import static pl.edu.wit.domain.passenger.document.SampleDefaultDocument.DEFAULT_DOCUMENT_NUMBER;

@DisplayName("document unit tests")
class DocumentTest {

    @Test
    @DisplayName("should create document without expiration date")
    void shouldCreateDocumentWithoutExpirationDate() {

        //when
        Document document = Document.create(DEFAULT_DOCUMENT_NUMBER, DEFAULT_DOCUMENT_ISSUE_DATE);

        //then
        assertNotNull(document);
        assertEquals(DEFAULT_DOCUMENT_NUMBER, document.getNumber());
        assertEquals(DEFAULT_DOCUMENT_ISSUE_DATE, document.getIssueAt());
        assertNull(document.getExpireAt());
    }

    @Test
    @DisplayName("should create document with expiration date")
    void shouldCreateDocumentWithExpirationDate() {

        //when
        Document document = Document.create(DEFAULT_DOCUMENT_EXPIRATION_DATE, DEFAULT_DOCUMENT_NUMBER, DEFAULT_DOCUMENT_ISSUE_DATE);

        //then
        assertNotNull(document);
        assertEquals(DEFAULT_DOCUMENT_NUMBER, document.getNumber());
        assertEquals(DEFAULT_DOCUMENT_ISSUE_DATE, document.getIssueAt());
        assertEquals(DEFAULT_DOCUMENT_EXPIRATION_DATE, document.getExpireAt());
    }
}