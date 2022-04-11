//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.peaksoft.service;

import com.peaksoft.model.Car;
import java.util.List;

public interface CarService {
    List<Car> getAllCars();

    void addCar(Car var1);

    Car getById(Integer var1);

    void updateCar(Car var1);

    void deleteCar(Car var1);
}
