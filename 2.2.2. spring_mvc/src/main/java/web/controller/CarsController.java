package web.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceForCar;

@Controller
@ComponentScan("web")
public class CarsController {

    private final ServiceForCar serviceForCar;

    public CarsController(ServiceForCar serviceForCar) {
        this.serviceForCar = serviceForCar;
    }

    @GetMapping(value = "/cars")
    public String listtOfCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars",serviceForCar.amountOfCars(count));
        return "cars";
    }

}
