public class NotebookComputerBuilder extends ComputerBuilder {
    public void buildCPU(){
        getComputer().setCPU("AMD");
    }
    public void buildMemory(){
        getComputer().setMemory("64G");
    }
    public void buildHardDisk(){
        getComputer().setHardDisk("2T");
    }
    public void buildHost(){
        getComputer().setHost("HASEE");
    }
}
