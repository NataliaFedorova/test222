package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoForCarImpl implements  DaoForCar {

    private final List<Car> list;
     {
        list = new ArrayList<>();
        list.add(new Car("Ford", 123, "red"));
        list.add(new Car("Volvo", 134, "green"));
        list.add(new Car("Nissan", 167, "yellow"));
        list.add(new Car("Lada", 153, "black"));
        list.add(new Car("Toyota", 253, "blue"));
    };

    @Override
    public List<Car> amountOfCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        if (count == 0 || count >= list.size()) {
            return list;
        } else {
            for(int i = 0; i < count; i ++) {
                cars.add(list.get(i));
            }
        }
        return cars;
    }
}
