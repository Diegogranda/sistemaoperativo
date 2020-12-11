public class ComputerClass {

    private String name;
    private int ramMemory;
    private int hardDisk;
    private Object operatingSystem;


    //constructores

    public ComputerClass(String name, int ramMemory, int hardDisk, Object operatingSystem) {
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem;
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

    public Object getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(Object operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void install(){
        System.out.println("asdasd");

    }
}

