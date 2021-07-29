package web.dao;

import web.model.Car;

import java.util.List;

public interface DaoForCar {
    List<Car> amountOfCars(Integer count);
}
