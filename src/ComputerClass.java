public class ComputerClass {

    private String name;
    private int ramMemory;
    private int hardDisk;
    private OperatingSystemClass operatingSystem;


    //constructores

    public ComputerClass(String name, int ramMemory, int hardDisk) {
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;
        this.operatingSystem =null;
    }

    // Getters y Setters

public String getName() {
    return name;
}
    public void setName(String name) {
        this.name = name;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public OperatingSystemClass getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystemClass operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void install(OperatingSystemClass o1){
        this.setOperatingSystem(o1);
    }
}

