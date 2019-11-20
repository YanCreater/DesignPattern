public class Client {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder=(ComputerBuilder)XMLUtil.getBean();
        Factory factory=new Factory();
        factory.setComputerBuilder(computerBuilder);

        System.out.println("电脑组成");
        System.out.println("CPU-->"+factory.consruct().getCPU());
        System.out.println("Memory-->"+factory.consruct().getMemory());
        System.out.println("HardDisk-->"+factory.consruct().getHardDisk());
        System.out.println("Host-->"+factory.consruct().getHost());
    }
}
