package com.spring.springExercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springExercise/config.xml");
        Exercise E1= (Exercise) context.getBean("E1");
        System.out.println(E1);
    }
}
