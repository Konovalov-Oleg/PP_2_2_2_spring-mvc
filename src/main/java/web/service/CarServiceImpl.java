package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private CarDaoImpl carDaoImpl;

    public CarServiceImpl(CarDaoImpl carDaoImpl) {
        this.carDaoImpl = carDaoImpl;
    }

    public List<Car> getSomeCars(int countCars) {
        return carDaoImpl.getAllCars().stream().limit(countCars).collect(Collectors.toList());
    }

    public List<Car> getAllCars() {
        return carDaoImpl.getAllCars();
    }
}
