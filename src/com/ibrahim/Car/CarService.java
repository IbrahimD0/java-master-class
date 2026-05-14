package com.ibrahim.Car;

import java.util.UUID;

public class CarService {

    private final CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public Car[] getAllCars() {
        return carDao.getCars();
    }

    public Car findCarById(UUID carId) {
        return carDao.findCarById(carId);
    }
}
