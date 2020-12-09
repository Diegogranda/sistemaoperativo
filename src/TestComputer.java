public class TestComputer {
    public static void main(String[] args) {
        ComputerClass c1 = new ComputerClass("Manolo", 2048, 200, "Kali/Linux");
        System.out.println(c1.getName() + " " + c1.getRamMemory() + " " + c1.getHardDisk() + " " + c1.getOperatingSystem());
        OperatingSystemClass os1 = new OperatingSystemClass("Kali/Linux", 1024, null, "1.6", "RISC", true, 5);
        System.out.println();}
}
