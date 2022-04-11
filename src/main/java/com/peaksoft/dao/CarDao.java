
package com.peaksoft.dao;

import com.peaksoft.model.Car;
import java.util.List;

public interface CarDao {
    List<Car> getAllCars();

    void addCar(Car car);

    Car getCarById(Integer id);

    void updateCar(Car car);

    void deleteCar(Car car);
}