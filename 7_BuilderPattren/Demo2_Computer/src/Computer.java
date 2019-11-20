public class Computer {
    private String CPU;
    private String memory;
    private String host;
    private String hardDisk;

    public String getCPU() {
        return CPU;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getHost() {
        return host;
    }

    public String getMemory() {
        return memory;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
