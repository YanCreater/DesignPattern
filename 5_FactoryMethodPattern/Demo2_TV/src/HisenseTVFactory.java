public class HisenseTVFactory implements TVFactory {
        @Override
        public TV produceTV() {
            System.out.println("生成海信电视中......");
            return new Hisense();
        }
}
