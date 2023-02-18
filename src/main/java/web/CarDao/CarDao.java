package web.CarDao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDao {
    private static int CARS_COUNT;
    private final List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "ZAZ", "969"));
        cars.add(new Car(++CARS_COUNT, "AZLK", "2140"));
        cars.add(new Car(++CARS_COUNT, "VAZ", "2112"));
        cars.add(new Car(++CARS_COUNT, "GAZ", "3110"));
        cars.add(new Car(++CARS_COUNT, "UAZ", "3160"));
    }

    public List<Car> getRangeCars(int range) {
       return (range == 0)? cars : cars.stream().limit(range).toList();
    }


}


