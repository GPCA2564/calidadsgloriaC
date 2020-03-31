package com.mix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
 public static void main(String[] args) {
	 
	 ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring_confing.xml");
		Administrador  administrador=(Administrador) applicationContext.getBean("admin");
		administrador.imprime();
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}

}
