//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.peaksoft.service;

import com.peaksoft.dao.CarDao;
import com.peaksoft.model.Car;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getAllCars() {
        return this.carDao.getAllCars();
    }

    public void addCar(Car car) {
        this.carDao.addCar(car);
    }

    public Car getById(Integer id) {
        return this.carDao.getCarById(id);
    }

    public void updateCar(Car car) {
        this.carDao.updateCar(car);
    }

    public void deleteCar(Car car) {
        this.carDao.deleteCar(car);
    }
}
