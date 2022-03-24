package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("com/beans.xml");
		
		Mess movie= (Mess)context.getBean("g");
		
		System.out.println(movie.id );
		System.out.println(movie.movieactor );
		System.out.println(movie.moviename );
	}

}
