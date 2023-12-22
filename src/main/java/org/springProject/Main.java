package org.springProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(AppConfig.class)){
            CarWash carWash = context.getBean("carWashBean", CarWash.class);
            carWash.wash();
        }
    }
}
