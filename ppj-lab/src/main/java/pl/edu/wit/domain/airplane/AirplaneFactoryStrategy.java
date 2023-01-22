package pl.edu.wit.domain.airplane;

class AirplaneFactoryStrategy {

    public AirplaneFactory getAirplaneFactory(AirplaneType airplaneType) {
        return switch (airplaneType) {
            case BOEING -> new BoeingAirplaneFactory();
            case AIRBUS -> new AirbusAirplaneFactory();
            default -> throw new IllegalArgumentException("cannot resolve factory for plane type " + airplaneType);
        };
    }
}
