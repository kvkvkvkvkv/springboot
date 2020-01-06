package com.epam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.epam.controller.ConstructorBased;
import com.epam.controller.DiController;
import com.epam.controller.PropertyBasedDi;
import com.epam.controller.SetterBased;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiApplication.class, args);
		
		DiController controller = (DiController) context.getBean("diController");
		System.out.println(controller.DI());
		
		System.out.println(context.getBean(PropertyBasedDi.class).greet());
		System.out.println(context.getBean(SetterBased.class).greet());
		System.out.println(context.getBean(ConstructorBased.class).greet());
	}

}
