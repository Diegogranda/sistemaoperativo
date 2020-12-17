public class TestComputer {
    public static void main(String[] args) {
        ComputerClass c1 = new ComputerClass("Manolo", 16, 100);
        System.out.println(c1.getName() + " " + c1.getRamMemory() + " " + c1.getHardDisk());
        OperatingSystemClass os1 = new OperatingSystemClass("Linux",2, "3.0", "x64", false, 20);
        SoftwareClass sw1 = new SoftwareClass("PowerPoint", "3.0", 8, 2);
        SoftwareClass sw2 = new SoftwareClass("OpenOffice", "2.1", 2, 1);

        c1.install(os1);

    }
//insertar métodos//


        }




