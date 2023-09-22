package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarDAOImpl implements CarDAO{
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Dodge", "Charger", 42000));
        cars.add(new Car("Dodge", "Challenger", 40000));
        cars.add(new Car("Chevrolet", "Corvette", 72000));
        cars.add(new Car("Ford", "Mustang", 30000));
        cars.add(new Car("Chevrolet", "Chevelle", 65000));
        //cars.add(new Car("Nissan", "Skyline C110", 66000));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

}
