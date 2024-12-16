package com.springdemo.SpringFirst;

import com.springdemo.SpringFirst.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springdemo.SpringFirst.Model.Laptop;

@SpringBootApplication
public class SpringFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringFirstApplication.class, args);

		LaptopService service=context.getBean(LaptopService.class);
		Laptop laptop=context.getBean(Laptop.class);
		service.addLaptop(laptop);
//		Devloper dev = context.getBean(Devloper.class);
//		System.out.println(dev.getAge());
	}

}
