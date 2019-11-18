public class ChanghongTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("长虹电视生产中.....");
        return new ChangHong();
    }
}
