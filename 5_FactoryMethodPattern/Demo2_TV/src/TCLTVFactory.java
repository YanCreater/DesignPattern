public class TCLTVFactory implements TVFactory{
    @Override
    public TV produceTV() {
        System.out.println("TCL电视生产中.....");
        return new TCLTV();
    }
}
