package dev.example;

import dev.example.Config.AppConfig;
import dev.example.service.EmployeeService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService service = applicationContext.getBean(EmployeeService.class);
        System.out.println(service.list());


    }
}
