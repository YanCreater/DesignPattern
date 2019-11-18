public class Client {
    public static void main(String[] args) throws Exception {
        try{
            EFactory eFactory;
            AirConditioner airConditioner;
            Television television;

            eFactory=(EFactory) XMLUtil.getBean();
            airConditioner=eFactory.produceAirConditioner();
            television=eFactory.produceTelevision();
            airConditioner.changeTemperature();
            television.display();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
