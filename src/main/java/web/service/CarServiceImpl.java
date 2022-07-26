package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getSomeCars(int countCars) {
        return carDao.getAllCars()
                .stream()
                .limit(countCars)
                .collect(Collectors.toList());
    }

    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }
}
