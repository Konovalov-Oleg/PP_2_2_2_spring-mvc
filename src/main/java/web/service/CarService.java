package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getSomeCars(int countCars);

    List<Car> getAllCars();
}
