package org.entdes.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	// @Bean
	// public ServletRegistrationBean<DispatcherServlet> servletRegistrationBean() {
	//     return new ServletRegistrationBean<>(new DispatcherServlet(), "/");
	// }

}
