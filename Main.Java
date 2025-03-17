public class Main

 {
    public static void main(String[] args) 

    {
        CPU cpu = new CPU(53.77);

        // Creating Processor and RAM objects
        CPU.Processor processor = new CPU.Processor(32.33, "DELL");
        CPU.RAM ram = new CPU.RAM(32, "HP");

        // Displaying information
        System.out.println("CPU Price: $" + cpu.getPrice());

        System.out.println("\nProcessor Manufacturer: " + processor.manufacturer);
        System.out.println("Processor Cores: " + processor.cores);
        System.out.println("Cache: " + processor.getCache());

        System.out.println("\nRAM Manufacturer: " + ram.manufacturer);
        System.out.println("RAM Memory: " + ram.memory + "GB");
        System.out.println("Clock Speed: " + ram.getClockSpeed() + " GHz");
    }
}
