package web.service;

import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    List<Car> getLimitedQuantityOfCars(int quantity);



}
