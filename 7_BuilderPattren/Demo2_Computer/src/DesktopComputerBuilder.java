public class DesktopComputerBuilder extends ComputerBuilder {
    public void buildCPU(){
        getComputer().setCPU("Inter");
    }
    public void buildMemory(){
        getComputer().setMemory("128G");
    }
    public void buildHardDisk(){
        getComputer().setHardDisk("10T");
    }
    public void buildHost(){
        getComputer().setHost("WWW");
    }
}
