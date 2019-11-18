public class MIFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        return new MITV();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new MIAirConditioner();
    }
}
