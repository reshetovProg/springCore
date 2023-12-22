package org.springProject;

import org.springframework.beans.factory.annotation.Value;

public class BigCar implements Car{

    String model;

    public BigCar(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return "big car: " + model;
    }
}
