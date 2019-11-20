public class Factory {
    private ComputerBuilder computerBuilder;
    public void setComputerBuilder(ComputerBuilder computerBuilder){
        this.computerBuilder=computerBuilder;
    }
    public Computer consruct(){
        computerBuilder.buildCPU();
        computerBuilder.buildHardDisk();
        computerBuilder.buildMemory();
        computerBuilder.buildHost();
        return computerBuilder.getComputer();
    }

}
