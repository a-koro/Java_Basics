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
public class Citizen {
    String surname;
    String givenName;
    int afm;
    Car car1;

    public Citizen(String surname, String givenName, int afm, Car car1) {
        this.surname = surname;
        this.givenName = givenName;
        this.afm = afm;
        this.car1 = car1;
    }
}