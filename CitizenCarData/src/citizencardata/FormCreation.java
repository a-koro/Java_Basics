/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citizencardata;

import java.util.Scanner;

/**
 *
 * @author korov
 */
public class FormCreation {
    
    public static void formCreation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String name = sc.next();
        System.out.println("Surname:");
        String surname = sc.next();
        System.out.println("AFM:");
        int afm = sc.nextInt();
        System.out.println("Do you own a car? Y/N");
        String yesOrNo = sc.next();
        if (yesOrNo.equals("Y")) {
            System.out.println("Brand:");
            String brand = sc.next();
            System.out.println("License number:");
            String licensePlate = sc.next();
            Car car1 = new Car(brand,licensePlate);
            Citizen citizenWithCar = new Citizen(surname,name,afm,car1);
            DataBase.list.add(citizenWithCar);
        }
        else{
            Citizen citizen = new Citizen(surname,name,afm,new Car("null","null"));
            DataBase.list.add(citizen);
        }
    }
}
