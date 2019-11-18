public class HaierFactory implements EFactory {
    @Override
    public AirConditioner produceAirConditioner() {
        System.out.println("海尔空调生产中");
        return new HaierAirConditioner();
    }

    @Override
    public Television produceTelevision() {
        System.out.println("海尔电视生产中");
        return new HaierTelevision();
    }
}
