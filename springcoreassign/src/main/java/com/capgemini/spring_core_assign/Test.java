package com.capgemini.spring_core_assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.spring_core_assign.beans.Message;

public class Test {

  public static void main(String[] args) {
	  
	  ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	  Message message=context.getBean(Message.class);
	  System.out.println(message.getMessage());
	  System.out.println(message.getUser().getId());
	  System.out.println(message.getUser().getName());
	  
		
	}
	
	
	
	
}
