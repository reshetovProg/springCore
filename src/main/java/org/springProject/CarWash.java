package org.springProject;

import java.util.ArrayList;
import java.util.Random;

public class CarWash {
    ArrayList<Car> cars;

    public CarWash(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void wash(){
        System.out.println(cars.get(new Random().nextInt(cars.size()-1)).getModel() + " washed");
    }
}
