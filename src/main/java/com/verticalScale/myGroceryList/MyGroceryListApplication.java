package com.verticalScale.myGroceryList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyGroceryListApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(MyGroceryListApplication.class);
		SpringApplication.run(MyGroceryListApplication.class, args);
		logger.info("String up server");
	}

}
