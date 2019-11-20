public abstract class ComputerBuilder {
    private Computer computer=new Computer();
    public void buildCPU(){}
    public void buildMemory(){}
    public void buildHardDisk(){}
    public void buildHost(){}

    public Computer getComputer() {
        return computer;
    }
}
