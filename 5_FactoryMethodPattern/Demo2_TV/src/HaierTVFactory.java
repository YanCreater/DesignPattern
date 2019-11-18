public class HaierTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("生成海尔电视中......");
        return new HaierTV();
    }
}
