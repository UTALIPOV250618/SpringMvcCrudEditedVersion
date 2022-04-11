//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.peaksoft.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users"
)
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;
    private String userName;
    private int age;
    @OneToOne( cascade = {CascadeType.ALL}
    )
    @JoinColumn(
            name = "fk_carId",
            referencedColumnName = "carId"
    )
    private Car car;

    public String toString() {
        return "User{id=" + this.id + ", userName='" + this.userName + '\'' + ", age=" + this.age + ", car=" + this.car.toString() + '}';
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User() {
    }

    public User(String name, int age) {
        this.userName = name;
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
