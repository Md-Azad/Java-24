package Assessment_test.Assignment_three;

public class Main {
    public static void main(String[] args) {
        // Create Manufacture instances
        Manufacture toyota = new Manufacture("Toyota", "Japan");
        Manufacture tesla = new Manufacture("Tesla", "USA");
        Manufacture ford = new Manufacture("Ford", "USA");

        // Create Engine instances
        Engine combustionEngine = new CombustionEngine();
        Engine electricEngine = new ElectricEngine();
        Engine hybridEngine = new HybridEngine();

        // Create Vehicle instances
        Vehicle car1 = new ICEV("Corolla", toyota, combustionEngine);
        Vehicle car2 = new BEV("Model S", tesla, electricEngine);
        Vehicle car3 = new HybridV("Fusion Hybrid", ford, hybridEngine);

        // Create an array of Vehicle objects
        Vehicle[] vehicles = { car1, car2, car3 };

        // Demonstrate ShowCharacteristics() for each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
            System.out.println();
        }
    }
}
