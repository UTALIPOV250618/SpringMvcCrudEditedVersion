
package com.peaksoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "cars")
public class Car {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int carId;
    private String carModel;
    private String dateOfProduct;
    @OneToOne( mappedBy = "car"
    )
    private User user;

    public Car() {
    }

    public Car(String carModel, String dateOfProduct, User user) {
        this.carModel = carModel;
        this.dateOfProduct = dateOfProduct;
        this.user = user;
    }

    public Car(Integer id, String carModel, String dateOfProduct, User user) {
        this.carId = id;
        this.carModel = carModel;
        this.dateOfProduct = dateOfProduct;
        this.user = user;
    }

    public Integer getCarId() {
        return this.carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getDateOfProduct() {
        return this.dateOfProduct;
    }

    public void setDateOfProduct(String dateOfProduct) {
        this.dateOfProduct = dateOfProduct;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String toString() {
        return "Car{carId=" + this.carId + ", carModel='" + this.carModel + '\'' + ", dateOfProduct='" + this.dateOfProduct + '\'' + ", user=" + this.user.toString() + '}';
    }
}
