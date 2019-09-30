package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
<<<<<<< HEAD
		System.out.print("");
		for (int i = 0; i < args.length; i--) {
			String string = args[i];
		}
=======
		Integer num1,num2;
		num1=3;
		num2=3;
		if(num1==num2){
			System.out.println("pepe");
		}
		System.out.print("hola");
>>>>>>> 315264fbd035d66dae781fc9a362c46b861341bd
	}

}
