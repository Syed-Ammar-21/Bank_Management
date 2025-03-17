public class CPU 

{
    private final double price; // Price of the CPU

    // Constructor for CPU
    public CPU(double price) {
        this.price = price;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Static nested class Processor
    public static class Processor {
        double cores;
        String manufacturer;

        // Constructor for Processor
        public Processor(double cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        // Method to get Cache value
        public double getCache() {
            return 4.2;
        }
    }

    // Static nested class RAM
    public static class RAM {
        double memory;
        String manufacturer;

        // Constructor for RAM
        public RAM(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        // Method to get Clock Speed
        public double getClockSpeed() {
            return 5.3;
        }
    }
}
