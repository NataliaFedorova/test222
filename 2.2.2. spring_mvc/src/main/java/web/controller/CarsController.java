package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.DaoForCarImpl;
import web.model.Car;
import web.service.ServiceForCar;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private final ServiceForCar serviceForCar;
    private final DaoForCarImpl daoForCarImpl;


    public CarsController(ServiceForCar serviceForCar) {
        this.serviceForCar = serviceForCar;
        daoForCarImpl = new DaoForCarImpl();
    }

    @GetMapping(value = "/cars")
    public String listtOfCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> list = new ArrayList<>();
            list.add(new Car("Ford", 123, "red"));
            list.add(new Car("Volvo", 134, "green"));
            list.add(new Car("Nissan", 167, "yellow"));
            list.add(new Car("Lada", 153, "black"));
            list.add(new Car("Toyota", 253, "blue"));
        if (count != null) {
            model.addAttribute("cars", serviceForCar.amountOfCars(count));
        } else {
            model.addAttribute("cars", daoForCarImpl.getList());
        }
        return "cars";
    }
    
}
