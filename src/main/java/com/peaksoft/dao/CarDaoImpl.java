package com.peaksoft.dao;

import com.peaksoft.model.Car;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDaoImpl implements CarDao {
    private SessionFactory sessionFactory;

    @Autowired
    public CarDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Car> getAllCars() {
        return this.sessionFactory.openSession().createQuery("from Car").getResultList();
    }

    public void addCar(Car car) {
        this.sessionFactory.openSession().save(car);
    }

    public Car getCarById(Integer id) {
        return (Car)this.sessionFactory.openSession().get(Car.class, id);
    }

    public void updateCar(Car car) {
        this.sessionFactory.getCurrentSession().update(car);
    }

    public void deleteCar(Car car) {
        this.sessionFactory.getCurrentSession().remove(car);
    }
}