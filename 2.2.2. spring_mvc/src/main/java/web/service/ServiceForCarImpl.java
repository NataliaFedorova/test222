package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.DaoForCar;
import web.model.Car;

import java.util.List;

@Component
public class ServiceForCarImpl implements ServiceForCar {

    @Autowired
    private final DaoForCar daoForCar;

    public ServiceForCarImpl(DaoForCar daoForCar) {
        this.daoForCar = daoForCar;
    }

    @Override
    public List<Car> amountOfCars(Integer count) {
        return daoForCar.amountOfCars(count);
    }
}
