import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car> {
    private String modelName;
    private int productionYear;

    public Car(String modelName, int productionYear) {
        this.modelName = modelName;
        this.productionYear = productionYear;
    }

    public String getModelName() {
        return modelName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.productionYear, other.productionYear);
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();


        cars.add(new Car("Toyota Corolla", 2010));
        cars.add(new Car("Honda Civic", 2015));
        cars.add(new Car("Ford Focus", 2012));
        cars.add(new Car("Chevrolet Malibu", 2018));
        cars.add(new Car("Nissan Altima", 2013));
        cars.add(new Car("Mazda 3", 2011));
        cars.add(new Car("Hyundai Elantra", 2014));
        cars.add(new Car("Volkswagen Jetta", 2016));
        cars.add(new Car("Subaru Impreza", 2017));
        cars.add(new Car("Kia Forte", 2019));


        Collections.sort(cars);


        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
