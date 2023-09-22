package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAOImpl;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String index(@RequestParam(value = "count", required = false) Integer count,
                        Model model) {
        if(count == null || count >= 5) {
            model.addAttribute("cars", carService.getAllCars());
        } else {
            model.addAttribute("cars", carService.getLimitedQuantityOfCars(count));
        }
        return "cars";
    }

}
