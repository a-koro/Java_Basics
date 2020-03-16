/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citizencardata;

/**
 *
 * @author korov
 */
public class Car {
    String brand;
    String licensePlate;

    public Car(String brand, String licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car:" + "\nbrand = " + brand + "\nlicensePlate = " + licensePlate;
    }
}
