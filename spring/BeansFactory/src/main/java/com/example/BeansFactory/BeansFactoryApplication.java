package com.example.BeansFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class BeansFactoryApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BeansFactoryApplication.class, args);

        System.out.println("===========Beans created by user================");
        List<Object> myBeans = Arrays.stream(context.getBeanDefinitionNames())
                .filter(beanName -> context.getBean(beanName).getClass().getPackage().getName().startsWith("com.example.BeansFactory"))
                .map(context::getBean)
                .collect(Collectors.toList());
        System.out.println("THE COUNT OF EXPLICIT BEANS USED BY APPLICATION: " + myBeans.size());
        myBeans.forEach((k) -> {
            System.out.println(k);
        });

        DisplayBeansFactory display = context.getBean(DisplayBeansFactory.class);
        display.DisplayBeansFactory(myBeans.size(),myBeans);

        System.out.println("\n\n");
        System.out.println("===========Beans loaded by spring boot================");
        int count = context.getBeanDefinitionCount();
        String[] beanNames = context.getBeanDefinitionNames();
        System.out.println("THE COUNT OF TOTAL BEANS USED BY APPLICATION: " + count);
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

    }
}
