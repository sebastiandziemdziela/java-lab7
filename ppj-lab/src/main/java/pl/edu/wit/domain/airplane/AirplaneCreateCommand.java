package pl.edu.wit.domain.airplane;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pl.edu.wit.domain.airplane.seat.SeatType;

import java.util.Map;

import static lombok.AccessLevel.PROTECTED;

@Getter
@Builder
@RequiredArgsConstructor(access = PROTECTED)
public class AirplaneCreateCommand {
    @NonNull
    private final AirplaneType type;

    private final String code;

    @NonNull
    private final Map<SeatType, SeatDefinition> seatDefinitions;

    @SuppressWarnings({"rawtypes", "unchecked"})
    public Map<SeatType, Integer> getSeatCounts() {
        Map.Entry[] entries = seatDefinitions.entrySet().stream()
                .map(entry -> Map.entry(entry.getKey(), entry.getValue().count))
                .toArray(Map.Entry[]::new);

        return Map.ofEntries(entries);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public Map<SeatType, Float> getSeatModifier() {
        Map.Entry[] entries = seatDefinitions.entrySet().stream()
                .map(entry -> Map.entry(entry.getKey(), entry.getValue().modifier))
                .toArray(Map.Entry[]::new);

        return Map.ofEntries(entries);
    }

    @RequiredArgsConstructor(staticName = "of")
    public static class SeatDefinition {
        private final int count;
        private final float modifier;
    }
}
