package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDAOImpl carDAO;

    @Override
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    @Override
    public List<Car> getLimitedQuantityOfCars(int quantity) {
        List<Car> limitedList = new ArrayList<>();
        for(int i = 0; i < quantity; i++) {
            limitedList.add(carDAO.getAllCars().get(i));
        }
        return limitedList;
    }
}
