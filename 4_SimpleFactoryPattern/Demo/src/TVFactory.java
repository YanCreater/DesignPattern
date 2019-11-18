public class TVFactory {
    public static TV produceTV(String brand) throws Exception{
        if(brand.equalsIgnoreCase("Haier"))
        {
            System.out.println("电视工厂生产海尔电视");
            return new HaierTV();
        }
        else if(brand.equalsIgnoreCase("Hisense"))
        {
            System.out.println("电视工厂生产海信电视");
            return new Hisense();
        }
        else if(brand.equalsIgnoreCase("TCL"))
        {
            System.out.println("电视工厂生产TCL电视");
            return new TCLTV();
        }
        else{
            throw new Exception("无法生产该品牌！！");
        }
    }
}
