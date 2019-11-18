public class TCLFactory implements EFactory {
    @Override
    public AirConditioner produceAirConditioner() {
        System.out.println("TCL空调生产中");
        return new TCLAirConditioner();
    }

    @Override
    public Television produceTelevision() {
        System.out.println("TCL电视生产中");
        return new TCLTelevision();
    }
}
