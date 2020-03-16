/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citizencardata;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author korov
 */
public class MainMenu {

    public static void clrscr() {
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException ex) {
        }
    }

    public static void mainMenu() {
        System.out.println("Main Menu");
        System.out.println("---------------------");
        System.out.println("1. Find car data.");
        System.out.println("2. Add new citizen");
        System.out.println("3. Exit");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            if (DataBase.list.size() >= 1) {
                System.out.println("Enter your Surname to print car info:");
                String surname = sc.next();
                for (int i = 0; i < DataBase.list.size(); i++) {
                    if (surname.equals(DataBase.list.get(i).surname)) {
                        clrscr();
                        System.out.println(DataBase.list.get(i).car1);
                        System.out.println("********************");
                        mainMenu();
                    }
                }
                clrscr();
                System.out.println("Invalid input");
                mainMenu();
            } else {
                clrscr();
                System.out.println("No Data!");
                mainMenu();
            }
        } else if (input == 2) {
            FormCreation.formCreation();
            clrscr();
            mainMenu();
        } else {
            clrscr();
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

}
