//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.peaksoft.controller;

import com.peaksoft.model.Car;
import com.peaksoft.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"cars"})
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getCars(Model model) {
        model.addAttribute("cars", this.carService.getAllCars());
        return "cars";
    }

    @GetMapping({"/add-car"})
    public String addCars(Car car) {
        return "add-car";
    }

    @PostMapping({"/save-car"})
    public String saveCar(Car car, Model model) {
        this.carService.addCar(car);
        model.addAttribute("cars", this.carService.getAllCars());
        return "cars";
    }

    @GetMapping({"/update-car/{carId}"})
    public String updateCar(@PathVariable("carId") Integer carId, Model model) {
        Car car = this.carService.getById(carId);
        model.addAttribute("car", car);
        return "update-car";
    }

    @PostMapping({"/edit-car/{carId}"})
    public String editCar(@PathVariable("carId") Integer carId, Car car, Model model) {
        this.carService.updateCar(car);
        model.addAttribute("cars", this.carService.getAllCars());
        return "cars";
    }

    @GetMapping({"/delete-car/{carId}"})
    public String deleteCar(@PathVariable("carId") Integer id, Model model) {
        this.carService.deleteCar(this.carService.getById(id));
        model.addAttribute("cars", this.carService.getAllCars());
        return "cars";
    }
}
