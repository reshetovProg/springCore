package org.springProject;

import org.springframework.beans.factory.annotation.Value;

public class SmallCar implements Car{

    String model;

    public SmallCar(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return "small car: " + model;
    }
}
