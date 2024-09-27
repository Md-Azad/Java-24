package Assessment_test.Assignment_two;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CarManager manager = new CarManager();

        try {
            // Save list of cars of a given brand
            manager.saveCarsByBrand("Toyota", "toyota_cars.txt");

            // Save list of cars of a given model that have been in use for more than 3
            // years
            manager.saveCarsByModelAndAge("Civic", 3, "civic_cars.txt");

            // Save list of cars of a given year of manufacture, the price of which is
            // higher than 20,000
            manager.saveCarsByYearAndPrice(2020, 20000, "expensive_cars.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
