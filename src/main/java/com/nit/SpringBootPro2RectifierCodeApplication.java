package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootPro2RectifierCodeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootPro2RectifierCodeApplication.class, args);
		ctx.getBean(null);
	}

}
