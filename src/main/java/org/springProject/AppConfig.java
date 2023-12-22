package org.springProject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {

    @Value("#{'${models}'.split(',')}")
    List<String> models;
    @Bean
    @Scope("prototype")
    public BigCar bigCarBean(){
        return new BigCar(getModelBean());
    }

    @Bean
    @Scope("prototype")
    public SmallCar smallCarBean(){
        return new SmallCar(getModelBean());
    }

    @Bean
    public CarWash carWashBean(){
        return new CarWash(carsListBean());
    }

    @Bean
    public ArrayList<Car> carsListBean(){
        ArrayList<Car> cars = new ArrayList<>();
        for(int i=0; i<4; i++){
            cars.add(bigCarBean());
        }
        for(int i=0; i<6; i++){
            cars.add(smallCarBean());
        }
        return cars;
    }

    @Bean
    public String getModelBean(){
        return models.get(new Random().nextInt(models.size()));

    }
}
