package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("BMW", 15245, 10));
        carList.add(new Car("Audi", 16789, 8));
        carList.add(new Car("Nissan", 9478, 5));
        carList.add(new Car("Lada", 213786, 22));
        carList.add(new Car("Mers", 1297, 1));
    }

    public List<Car> getAllCars() {
        return carList;
    }
}
