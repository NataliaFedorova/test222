package web.service;

import web.model.Car;

import java.util.List;

public interface ServiceForCar {
    List<Car> amountOfCars(Integer count);
}
