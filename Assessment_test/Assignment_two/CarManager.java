package Assessment_test.Assignment_two;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private List<Car> cars;

    public CarManager() {
        cars = new ArrayList<>();
        initializeCars();
    }

    private void initializeCars() {
        cars.add(new Car(1, "Toyota", "Corolla", 2015, "Red", 15000, "ABC123"));
        cars.add(new Car(2, "Honda", "Civic", 2018, "Blue", 18000, "DEF456"));
        cars.add(new Car(3, "Ford", "Focus", 2012, "Green", 12000, "GHI789"));
        cars.add(new Car(4, "Toyota", "Camry", 2020, "Black", 24000, "JKL012"));

    }

    public void saveCarsByBrand(String brand, String filename) throws IOException {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(brand)) {
                filteredCars.add(car);
            }
        }
        writeToFile(filteredCars, filename);
    }

    public void saveCarsByModelAndAge(String model, int years, String filename) throws IOException {
        List<Car> filteredCars = new ArrayList<>();
        int currentYear = 2024; // You can get the current year dynamically if needed
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && (currentYear - car.getYearOfManufacture() > years)) {
                filteredCars.add(car);
            }
        }
        writeToFile(filteredCars, filename);
    }

    public void saveCarsByYearAndPrice(int year, double minPrice, String filename) throws IOException {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfManufacture() == year && car.getPrice() > minPrice) {
                filteredCars.add(car);
            }
        }
        writeToFile(filteredCars, filename);
    }

    private void writeToFile(List<Car> cars, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Car car : cars) {
                writer.write(car.toString());
                writer.newLine();
            }
        }
    }
}
