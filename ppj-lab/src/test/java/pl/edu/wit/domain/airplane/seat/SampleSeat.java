package pl.edu.wit.domain.airplane.seat;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SampleSeat {

    public static final String DEFAULT_SEAT_NUMBER = "BU124";

    public static final Seat SAMPLE_BUSINESS_SEAT = Seat.createBusinessClass(DEFAULT_SEAT_NUMBER);

    public static Seat createBusinessClass(String number) {
        return Seat.createBusinessClass(number);
    }

    public static Seat creatEconomyClass(String number) {
        return Seat.createEconomyClass(number);
    }

    public static Seat createFirstClass(String number) {
        return Seat.createFirstClass(number);
    }

    public static Set<Seat> getSeats(
            int economyClassCount, int businessClassCount, int firstClassCount,
            String seatPrefix, String economyPrefix, String businessPrefix, String fistClassPrefix) {

        Stream<Seat> economyClassSeats = economyClassCount > 0
                ? createSeats(economyClassCount, seatPrefix + economyPrefix).map(SampleSeat::creatEconomyClass)
                : Stream.empty();

        Stream<Seat> businessClassSeats = businessClassCount > 0
                ? createSeats(businessClassCount, seatPrefix + businessPrefix).map(SampleSeat::createBusinessClass)
                : Stream.empty();

        Stream<Seat> firstClassSeats = firstClassCount > 0
                ? createSeats(firstClassCount, seatPrefix + fistClassPrefix).map(SampleSeat::createFirstClass)
                : Stream.empty();

        return Stream.of(economyClassSeats, businessClassSeats, firstClassSeats).flatMap(Function.identity()).collect(Collectors.toSet());
    }


    private static Stream<String> createSeats(int endExclusive, String format) {
        return IntStream.range(1, endExclusive).mapToObj(value -> String.format(format + "%d", value));
    }
}